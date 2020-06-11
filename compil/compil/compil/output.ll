declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@bod = global double 0.0
@w = global double 0.0
@x = global i32 0
@max = global i32 0
@arg = global i32 0
@str0 = constant[10 x i8] c"example1\0A\00"
@str1 = constant[3 x i8] c" \0A\00"
define void @proc() nounwind {
  entry:
  %0 = load double, double* @w
  %1 = load double, double* @bod
  %2 = fadd double %0, %1
  store double %2, double* @w
  %3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [10 x i8], [10 x i8]* @str0, i32 0, i32 0))
  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [3 x i8], [3 x i8]* @str1, i32 0, i32 0))
  ret void
}

@str2 = constant[10 x i8] c"example3\0A\00"
@str3 = constant[3 x i8] c" \0A\00"
define i32 @main() nounwind {
  store double 22.75, double* @bod
  store double 38.31, double* @w
  store i32 84, i32* @x
  store i32 100, i32* @max
  store i32 255, i32* @arg
  %1 = load i32, i32* @arg
  %2 = icmp sgt i32 %1, 100
  %3 = load i32, i32* @x
  %4 = load i32, i32* @max
  %5 = icmp slt i32 %3, %4
  %6 = or i1 %5, %2
  br i1 %6, label %true1, label %false1
  true1:
  call void @proc()
  br label %false1
  false1:
  br label %while2
  while2:
  %7 = load i32, i32* @x
  %8 = load i32, i32* @max
  %9 = icmp slt i32 %7, %8
  br i1 %9, label %true2, label %false2
  true2:
  %10 = load i32, i32* @x
  %11 = add i32 %10, 1
  store i32 %11, i32* @x
  %12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [10 x i8], [10 x i8]* @str2, i32 0, i32 0))
  %13 = load i32, i32* @x
  %14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %13)
  %15 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [3 x i8], [3 x i8]* @str3, i32 0, i32 0))
  %16 = load i32, i32* @x
  %17 = icmp eq i32 %16, 97
  br i1 %17, label %true3, label %false3
  true3:
  br label %false2
  br label %false3
  false3:
  %19 = load i32, i32* @x
  %20 = load i32, i32* @max
  %21 = icmp slt i32 %19, %20
  br label %while2
  false2:
  ret i32 0
}

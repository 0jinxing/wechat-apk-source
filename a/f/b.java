package a.f;

import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/jvm/KotlinReflectionNotSupportedError;", "Ljava/lang/Error;", "()V", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "kotlin-stdlib"})
public final class b extends Error
{
  public b()
  {
    super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.f.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.accessibility;

public class AccessibilityIdNotFoundException extends AccessibilityCaptureNotSupportException
{
  public AccessibilityIdNotFoundException()
  {
    super("Unable to find accessibility id");
  }

  public AccessibilityIdNotFoundException(String paramString)
  {
    super(paramString);
  }

  public AccessibilityIdNotFoundException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }

  public AccessibilityIdNotFoundException(Throwable paramThrowable)
  {
    super("Unable to find accessibility id", paramThrowable);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.accessibility.AccessibilityIdNotFoundException
 * JD-Core Version:    0.6.2
 */
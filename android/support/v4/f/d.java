package android.support.v4.f;

public final class d
{
  public static void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    if (paramObject == null)
      paramStringBuilder.append("null");
    while (true)
    {
      return;
      String str1 = paramObject.getClass().getSimpleName();
      String str2;
      if (str1 != null)
      {
        str2 = str1;
        if (str1.length() > 0);
      }
      else
      {
        str1 = paramObject.getClass().getName();
        int i = str1.lastIndexOf('.');
        str2 = str1;
        if (i > 0)
          str2 = str1.substring(i + 1);
      }
      paramStringBuilder.append(str2);
      paramStringBuilder.append('{');
      paramStringBuilder.append(Integer.toHexString(System.identityHashCode(paramObject)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.f.d
 * JD-Core Version:    0.6.2
 */
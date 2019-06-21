package org.xwalk.core.util;

public class WebAddress$ParseException extends RuntimeException
{
  public String response;

  WebAddress$ParseException(String paramString)
  {
    this.response = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     org.xwalk.core.util.WebAddress.ParseException
 * JD-Core Version:    0.6.2
 */
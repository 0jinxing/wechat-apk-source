package org.xwalk.core.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebAddress
{
  static final int MATCH_GROUP_AUTHORITY = 2;
  static final int MATCH_GROUP_HOST = 3;
  static final int MATCH_GROUP_PATH = 5;
  static final int MATCH_GROUP_PORT = 4;
  static final int MATCH_GROUP_SCHEME = 1;
  static Pattern sAddressPattern;
  private String mAuthInfo;
  private String mHost;
  private String mPath;
  private int mPort;
  private String mScheme;

  static
  {
    AppMethodBeat.i(86234);
    sAddressPattern = Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_-][a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);
    AppMethodBeat.o(86234);
  }

  public WebAddress(String paramString)
  {
    AppMethodBeat.i(86232);
    if (paramString == null)
    {
      paramString = new NullPointerException();
      AppMethodBeat.o(86232);
      throw paramString;
    }
    this.mScheme = "";
    this.mHost = "";
    this.mPort = -1;
    this.mPath = "/";
    this.mAuthInfo = "";
    paramString = sAddressPattern.matcher(paramString);
    String str;
    if (paramString.matches())
    {
      str = paramString.group(1);
      if (str != null)
        this.mScheme = str.toLowerCase(Locale.ROOT);
      str = paramString.group(2);
      if (str != null)
        this.mAuthInfo = str;
      str = paramString.group(3);
      if (str != null)
        this.mHost = str;
      str = paramString.group(4);
      if ((str == null) || (str.length() <= 0));
    }
    while (true)
    {
      try
      {
        this.mPort = Integer.parseInt(str);
        paramString = paramString.group(5);
        if ((paramString != null) && (paramString.length() > 0))
        {
          if (paramString.charAt(0) == '/')
            this.mPath = paramString;
        }
        else
        {
          if ((this.mPort != 443) || (!this.mScheme.equals("")))
            break label283;
          this.mScheme = "https";
          if (this.mScheme.equals(""))
            this.mScheme = "http";
          AppMethodBeat.o(86232);
          return;
        }
      }
      catch (NumberFormatException paramString)
      {
        paramString = new WebAddress.ParseException("Bad port");
        AppMethodBeat.o(86232);
        throw paramString;
      }
      this.mPath = "/".concat(String.valueOf(paramString));
      continue;
      paramString = new WebAddress.ParseException("Bad address");
      AppMethodBeat.o(86232);
      throw paramString;
      label283: if (this.mPort == -1)
        if (this.mScheme.equals("https"))
          this.mPort = 443;
        else
          this.mPort = 80;
    }
  }

  public String getAuthInfo()
  {
    return this.mAuthInfo;
  }

  public String getHost()
  {
    return this.mHost;
  }

  public String getPath()
  {
    return this.mPath;
  }

  public int getPort()
  {
    return this.mPort;
  }

  public String getScheme()
  {
    return this.mScheme;
  }

  public void setAuthInfo(String paramString)
  {
    this.mAuthInfo = paramString;
  }

  public void setHost(String paramString)
  {
    this.mHost = paramString;
  }

  public void setPath(String paramString)
  {
    this.mPath = paramString;
  }

  public void setPort(int paramInt)
  {
    this.mPort = paramInt;
  }

  public void setScheme(String paramString)
  {
    this.mScheme = paramString;
  }

  public String toString()
  {
    AppMethodBeat.i(86233);
    String str1 = "";
    if ((this.mPort == 443) || (!this.mScheme.equals("https")))
    {
      str2 = str1;
      if (this.mPort != 80)
      {
        str2 = str1;
        if (!this.mScheme.equals("http"));
      }
    }
    else
    {
      str2 = ":" + Integer.toString(this.mPort);
    }
    str1 = "";
    if (this.mAuthInfo.length() > 0)
      str1 = this.mAuthInfo + "@";
    String str2 = this.mScheme + "://" + str1 + this.mHost + str2 + this.mPath;
    AppMethodBeat.o(86233);
    return str2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.xwalk.core.util.WebAddress
 * JD-Core Version:    0.6.2
 */
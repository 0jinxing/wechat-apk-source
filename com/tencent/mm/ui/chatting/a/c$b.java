package com.tencent.mm.ui.chatting.a;

import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class c$b
{
  public String bCv;
  public long cvx;
  public String iQV;
  public String nickname;
  public long timestamp;
  public String title;
  public int type;
  public String username;
  Pattern yNM = Pattern.compile("[._a-zA-Z0-9]+");

  public c$b()
  {
  }

  public c$b(long paramLong1, int paramInt, String paramString1, long paramLong2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.timestamp = paramLong1;
    this.type = paramInt;
    this.title = paramString1;
    this.cvx = paramLong2;
    this.username = paramString2;
    this.nickname = paramString3;
    this.bCv = paramString4;
    this.iQV = paramString5;
  }

  protected static boolean arh(String paramString)
  {
    boolean bool1 = false;
    paramString = paramString.toCharArray();
    for (int i = 0; ; i++)
    {
      boolean bool2 = bool1;
      if (i < paramString.length)
      {
        if ((paramString[i] >= '一') && (paramString[i] <= 40891))
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  public boolean arg(String paramString)
  {
    boolean bool1 = true;
    boolean bool2;
    if (!arh(paramString))
      if ((!bo.isNullOrNil(this.title)) && (isContains(paramString, this.title.toLowerCase())))
        bool2 = bool1;
    while (true)
    {
      return bool2;
      if (!bo.isNullOrNil(this.nickname))
      {
        bool2 = bool1;
        if (isContains(paramString, this.nickname.toLowerCase()));
      }
      else if (!bo.isNullOrNil(this.iQV))
      {
        bool2 = bool1;
        if (isContains(paramString, this.iQV.toLowerCase()));
      }
      else if (!bo.isNullOrNil(this.bCv))
      {
        bool2 = bool1;
        if (isContains(paramString, this.bCv.toLowerCase()));
      }
      else
      {
        do
        {
          bool2 = false;
          break;
          if (!bo.isNullOrNil(this.title))
          {
            bool2 = bool1;
            if (this.title.toLowerCase().contains(paramString))
              break;
          }
          if (!bo.isNullOrNil(this.nickname))
          {
            bool2 = bool1;
            if (this.nickname.toLowerCase().contains(paramString))
              break;
          }
          if (!bo.isNullOrNil(this.iQV))
          {
            bool2 = bool1;
            if (this.iQV.toLowerCase().contains(paramString))
              break;
          }
        }
        while ((bo.isNullOrNil(this.bCv)) || (!this.bCv.toLowerCase().contains(paramString)));
        bool2 = bool1;
      }
    }
  }

  public boolean equals(Object paramObject)
  {
    boolean bool;
    if ((paramObject != null) && ((paramObject instanceof b)))
      if (this.cvx == ((b)paramObject).cvx)
        bool = true;
    while (true)
    {
      return bool;
      bool = false;
      continue;
      bool = super.equals(paramObject);
    }
  }

  public int getType()
  {
    return this.type;
  }

  protected final boolean isContains(String paramString1, String paramString2)
  {
    boolean bool2;
    if (!bo.isNullOrNil(paramString2))
    {
      Matcher localMatcher = this.yNM.matcher(paramString2);
      bool1 = false;
      do
      {
        if (!localMatcher.find())
          break;
        paramString2 = localMatcher.group();
        bool2 = paramString2.startsWith(paramString1);
        ab.i("MicroMsg.MediaHistoryListAdapter", "[isContains] search:%s group:%s", new Object[] { paramString1, paramString2 });
        bool1 = bool2;
      }
      while (!bool2);
    }
    for (boolean bool1 = bool2; ; bool1 = false)
      return bool1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.c.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.recovery.log;

import java.util.ArrayList;
import java.util.List;

public class RecoveryCacheLog
  implements RecoveryLog.RecoveryLogImpl
{
  List<LogItem> Are = new ArrayList(100);

  public final void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (this.Are.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 2;
      localLogItem.tag = paramString1;
      localLogItem.Arf = paramString2;
      localLogItem.Arg = paramArrayOfObject;
      this.Are.add(localLogItem);
    }
    String.format(paramString2, paramArrayOfObject);
  }

  public final void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (this.Are.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 5;
      localLogItem.tag = paramString1;
      localLogItem.Arf = paramString2;
      localLogItem.Arg = paramArrayOfObject;
      this.Are.add(localLogItem);
    }
    String.format(paramString2, paramArrayOfObject);
  }

  public final void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (this.Are.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 3;
      localLogItem.tag = paramString1;
      localLogItem.Arf = paramString2;
      localLogItem.Arg = paramArrayOfObject;
      this.Are.add(localLogItem);
    }
    String.format(paramString2, paramArrayOfObject);
  }

  public final void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    if (this.Are.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 5;
      localLogItem.tag = paramString1;
      localLogItem.Arf = paramString2;
      localLogItem.Arg = paramArrayOfObject;
      localLogItem.Arh = paramThrowable;
      this.Are.add(localLogItem);
    }
    String.format(paramString2, paramArrayOfObject);
  }

  public final void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (this.Are.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 1;
      localLogItem.tag = paramString1;
      localLogItem.Arf = paramString2;
      localLogItem.Arg = paramArrayOfObject;
      this.Are.add(localLogItem);
    }
    String.format(paramString2, paramArrayOfObject);
  }

  public final void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (this.Are.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 4;
      localLogItem.tag = paramString1;
      localLogItem.Arf = paramString2;
      localLogItem.Arg = paramArrayOfObject;
      this.Are.add(localLogItem);
    }
    String.format(paramString2, paramArrayOfObject);
  }

  class LogItem
  {
    String Arf;
    Object[] Arg;
    Throwable Arh;
    int level;
    String tag;

    private LogItem()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.log.RecoveryCacheLog
 * JD-Core Version:    0.6.2
 */
package com.tencent.recovery.option;

import android.content.Context;

public abstract interface IOptionsCreator
{
  public abstract CommonOptions createCommonOptions(Context paramContext);

  public abstract ProcessOptions createProcessOptions(String paramString, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.option.IOptionsCreator
 * JD-Core Version:    0.6.2
 */
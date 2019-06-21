package com.tencent.mm.plugin.appbrand.report;

import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class h extends c
{
  public void enter()
  {
    super.enter();
    ab.i("MicroMsg.LoggerState", getName() + " [ENTERING]");
  }

  public void exit()
  {
    super.exit();
    ab.i("MicroMsg.LoggerState", getName() + " [EXITING]");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.h
 * JD-Core Version:    0.6.2
 */
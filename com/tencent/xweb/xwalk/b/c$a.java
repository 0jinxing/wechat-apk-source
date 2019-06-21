package com.tencent.xweb.xwalk.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkUpdater.UpdateConfig;

public final class c$a
{
  public String ATb;
  public String ATc;
  public String ATg;
  public boolean ATh;
  public int ATn;
  public long ATs;
  public boolean ATt;
  public String ATu;
  public long ATv;
  public String ATw;
  public int ATx;
  public int ATy;
  public boolean bTryUseSharedCore;
  public boolean bUseCdn;
  public String cdy;

  static
  {
    AppMethodBeat.i(85455);
    if (!c.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(85455);
      return;
    }
  }

  public final XWalkUpdater.UpdateConfig dWe()
  {
    AppMethodBeat.i(85454);
    try
    {
      if (this.ATt)
        break label145;
      if ((this.ATb != null) && (!this.ATb.isEmpty()))
        break label120;
      if ($assertionsDisabled)
        break label71;
      AssertionError localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>("royle:no md5 info, maybe something wrong");
      AppMethodBeat.o(85454);
      throw localAssertionError;
    }
    catch (Exception localException)
    {
      XWalkInitializer.addXWalkInitializeLog("create  UpdateConfig failed , args is not valid");
      c.a(null);
      AppMethodBeat.o(85454);
      localObject = null;
    }
    return localObject;
    label71: Object localObject = new org/xwalk/core/XWalkUpdater$UpdateConfig;
    ((XWalkUpdater.UpdateConfig)localObject).<init>(this.ATg, false, this.ATn);
    while (true)
    {
      ((XWalkUpdater.UpdateConfig)localObject).versionDetail = this.ATw;
      ((XWalkUpdater.UpdateConfig)localObject).bUseCdn = this.bUseCdn;
      ((XWalkUpdater.UpdateConfig)localObject).bTryUseSharedCore = this.bTryUseSharedCore;
      AppMethodBeat.o(85454);
      break;
      label120: localObject = new XWalkUpdater.UpdateConfig(this.ATb, false, null, this.ATg, this.ATn);
      continue;
      label145: if ((this.ATb == null) || (this.ATb.isEmpty()) || (this.cdy == null) || (this.cdy.isEmpty()))
      {
        if (!$assertionsDisabled)
        {
          localObject = new java/lang/AssertionError;
          ((AssertionError)localObject).<init>("royle:no md5 info, maybe something wrong");
          AppMethodBeat.o(85454);
          throw ((Throwable)localObject);
        }
        localObject = new XWalkUpdater.UpdateConfig(this.ATg, true, this.ATn);
      }
      else
      {
        localObject = new XWalkUpdater.UpdateConfig(this.cdy, true, this.ATb, this.ATg, this.ATn);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.b.c.a
 * JD-Core Version:    0.6.2
 */
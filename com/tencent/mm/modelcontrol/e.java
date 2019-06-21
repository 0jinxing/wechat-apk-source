package com.tencent.mm.modelcontrol;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class e
{
  protected String fzR;
  protected int fzS;
  protected int fzT;
  protected int fzU;
  protected int fzV;
  protected boolean fzW;
  protected f[] fzX;

  protected final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(50617);
    this.fzR = paramString1;
    this.fzS = bo.getInt(paramString2, 0);
    int i;
    if (this.fzS == 0)
    {
      i = 64000;
      this.fzS = i;
      this.fzT = bo.getInt(paramString3, 10);
      this.fzU = bo.getInt(paramString4, 2);
      this.fzV = bo.getInt(paramString5, 1);
      if (bo.getInt(paramString6, 0) <= 0)
        break label103;
    }
    label103: for (boolean bool = true; ; bool = false)
    {
      this.fzW = bool;
      AppMethodBeat.o(50617);
      return;
      i = this.fzS * 1000;
      break;
    }
  }

  protected final boolean afQ()
  {
    AppMethodBeat.i(50618);
    boolean bool;
    if (bo.isNullOrNil(this.fzR))
    {
      bool = true;
      AppMethodBeat.o(50618);
    }
    while (true)
    {
      return bool;
      bool = b.rR(this.fzR);
      AppMethodBeat.o(50618);
    }
  }

  protected final VideoTransPara afR()
  {
    AppMethodBeat.i(50619);
    Object localObject1 = null;
    Object localObject2 = null;
    if (this.fzX != null)
    {
      f[] arrayOff = this.fzX;
      int i = arrayOff.length;
      int j = 0;
      while (true)
      {
        localObject1 = localObject2;
        if (j >= i)
          break;
        f localf = arrayOff[j];
        localObject1 = localObject2;
        if (localf != null)
        {
          localObject1 = localObject2;
          if (localf.fzY <= 0)
          {
            localObject1 = localObject2;
            if (localf.fzZ >= 0)
            {
              localObject1 = new VideoTransPara();
              ((VideoTransPara)localObject1).width = localf.fAa;
              ((VideoTransPara)localObject1).height = localf.fAb;
              ((VideoTransPara)localObject1).fps = localf.fAc;
              ((VideoTransPara)localObject1).videoBitrate = localf.fAd;
              ((VideoTransPara)localObject1).fzT = this.fzT;
              ((VideoTransPara)localObject1).fzS = this.fzS;
              ((VideoTransPara)localObject1).fzU = this.fzU;
              ((VideoTransPara)localObject1).fzV = this.fzV;
            }
          }
        }
        j++;
        localObject2 = localObject1;
      }
    }
    AppMethodBeat.o(50619);
    return localObject1;
  }

  public final String toString()
  {
    AppMethodBeat.i(50620);
    String str = "[ busyTime " + this.fzR + " audioBitrate " + this.fzS + " iFrame " + this.fzT + " profileIndex " + this.fzU + " presetIndex " + this.fzV + " isStepBr " + this.fzW + " ]";
    AppMethodBeat.o(50620);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcontrol.e
 * JD-Core Version:    0.6.2
 */
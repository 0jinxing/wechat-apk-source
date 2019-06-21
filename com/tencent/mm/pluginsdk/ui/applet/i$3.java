package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;

final class i$3
  implements k.a
{
  i$3(i parami)
  {
  }

  public final void KT(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(79733);
    j localj;
    int j;
    if ((this.vkB.rPU != null) && (this.vkB.vkt != null))
    {
      localj = this.vkB.vkt;
      if (localj.vkL)
        if ((!localj.ekq) && (paramInt == localj.vkJ + 2))
        {
          j = 1;
          if (j != 0)
            break label412;
          localj = this.vkB.vkt;
          if ((localj.ekq) || (paramInt != localj.vkJ))
            break label165;
          j = 1;
          label93: if (j == 0)
            break label171;
          if (!this.vkB.vkt.vkM)
            break label412;
          this.vkB.rPU.iC(paramInt);
          AppMethodBeat.o(79733);
        }
    }
    while (true)
    {
      return;
      j = 0;
      break;
      if ((!localj.ekq) && (paramInt == localj.vkJ + 1))
      {
        j = 1;
        break;
      }
      j = 0;
      break;
      label165: j = 0;
      break label93;
      label171: localj = this.vkB.vkt;
      if ((!localj.ekq) && (paramInt == localj.vkJ + 1))
        j = i;
      while (true)
        if (j != 0)
        {
          if (!this.vkB.vkt.vkL)
            break label412;
          if (t.kH(this.vkB.username))
          {
            this.vkB.rPU.iA(paramInt);
            AppMethodBeat.o(79733);
            break;
            j = 0;
            continue;
          }
          this.vkB.vkt.KU(0);
          AppMethodBeat.o(79733);
          break;
        }
      if ((this.vkB.vkt.ekq) && (this.vkB.vkt.KW(paramInt)))
      {
        this.vkB.rPU.iA(paramInt);
        AppMethodBeat.o(79733);
      }
      else if ((this.vkB.vkt.ekq) && (!this.vkB.vkt.KW(paramInt)))
      {
        this.vkB.rPU.JT();
        AppMethodBeat.o(79733);
      }
      else
      {
        if ((!this.vkB.vkt.ekq) && (this.vkB.vkt.KW(paramInt)))
          this.vkB.rPU.iB(paramInt);
        label412: AppMethodBeat.o(79733);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.i.3
 * JD-Core Version:    0.6.2
 */
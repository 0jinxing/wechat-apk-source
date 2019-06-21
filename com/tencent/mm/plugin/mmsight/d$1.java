package com.tencent.mm.plugin.mmsight;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;

final class d$1
  implements Runnable
{
  d$1(int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76399);
    for (int i = d.access$000(); i < this.osy; i++)
    {
      b localb1 = new b(String.format("%s/tempvideo%s.mp4", new Object[] { this.osz, Integer.valueOf(i) }));
      if (localb1.exists())
        localb1.delete();
      b localb2 = new b(j.w(localb1.dMD()) + ".remux");
      if (localb2.exists())
        localb2.delete();
      localb2 = new b(localb1.dME() + ".thumb");
      if (localb2.exists())
        localb2.delete();
    }
    d.access$002(Math.max(this.osy, 0));
    AppMethodBeat.o(76399);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.d.1
 * JD-Core Version:    0.6.2
 */
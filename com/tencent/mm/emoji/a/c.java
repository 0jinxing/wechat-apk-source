package com.tencent.mm.emoji.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
{
  private static int eyF = 98304;
  private static int eyG = 4;
  private boolean bcU;
  private final EmojiInfo exP;
  private boolean eyH;
  private boolean eyI;
  private String eyJ;
  private List<String> eyK;
  private String eyL;
  public c.b eyM;
  private List<c.c> eyN;
  private int eyO;
  private int eyP;
  private int eyQ;
  private long eyR;
  private boolean eyS;

  public c(EmojiInfo paramEmojiInfo, boolean paramBoolean1, boolean paramBoolean2, String paramString1, List<String> paramList, String paramString2)
  {
    AppMethodBeat.i(62244);
    this.bcU = false;
    this.eyN = new ArrayList();
    this.eyP = 2;
    ab.i("MicroMsg.EmojiUploadHelper", "EmojiUploadHelper: isCapture %s", new Object[] { Boolean.valueOf(paramBoolean1) });
    this.exP = paramEmojiInfo;
    this.eyH = paramBoolean1;
    this.eyI = paramBoolean2;
    this.eyJ = paramString1;
    this.eyK = paramList;
    this.eyL = paramString2;
    this.eyR = System.currentTimeMillis();
    int i = paramEmojiInfo.field_size;
    int j = (int)Math.ceil(i * 1.0D / eyF);
    this.eyO = (j * 2);
    this.eyQ = 0;
    for (int k = 0; k < j; k++)
    {
      int m = k * eyF;
      int n = eyF;
      int i1 = n;
      if (m + n > i)
        i1 = i - m;
      paramString1 = new c.c(this, (byte)0);
      paramString1.index = k;
      paramString1.start = m;
      paramString1.cde = i1;
      this.eyN.add(paramString1);
    }
    ab.i("MicroMsg.EmojiUploadHelper", "start upload emoji, md5 %s, totalLen %d, parts %d, file %s", new Object[] { paramEmojiInfo.Aq(), Integer.valueOf(i), Integer.valueOf(j), paramEmojiInfo.dve() });
    for (k = 0; k < eyG; k++)
      OI();
    AppMethodBeat.o(62244);
  }

  private void OI()
  {
    Object localObject1 = null;
    int i = 1;
    int j = 0;
    while (true)
    {
      Object localObject2;
      try
      {
        AppMethodBeat.i(62245);
        if (this.bcU)
        {
          AppMethodBeat.o(62245);
          return;
        }
        localObject2 = this.eyN.iterator();
        label39: if (!((Iterator)localObject2).hasNext())
          break label324;
        c.c localc1 = (c.c)((Iterator)localObject2).next();
        if (localc1.eyV)
          break label321;
        if (!localc1.running)
        {
          i = j;
          if (localc1 != null)
            break label123;
          if (i != 0)
          {
            ab.w("MicroMsg.EmojiUploadHelper", "all parts finished but not completed");
            a(4, 4, null, false);
          }
          AppMethodBeat.o(62245);
          continue;
        }
      }
      finally
      {
      }
      i = 0;
      label321: 
      while (true)
      {
        break label39;
        label123: if (this.eyQ >= this.eyO)
        {
          ab.w("MicroMsg.EmojiUploadHelper", "req count is %d, max is %d; toRun part is %d", new Object[] { Integer.valueOf(this.eyQ), Integer.valueOf(this.eyO), Integer.valueOf(localc2.index) });
          a(3, -2, null, false);
          AppMethodBeat.o(62245);
          break;
        }
        this.eyQ += 1;
        localc2.retryCount += 1;
        localc2.running = true;
        ab.i("MicroMsg.EmojiUploadHelper", "start part %d, retry count %d", new Object[] { Integer.valueOf(localc2.index), Integer.valueOf(localc2.retryCount) });
        localObject1 = new com/tencent/mm/emoji/a/c$a;
        ((c.a)localObject1).<init>(this, this.exP, localc2, this.eyH, this.eyI, this.eyJ, this.eyK, this.eyL);
        localObject2 = ((c.a)localObject1).acy();
        localObject1 = new com/tencent/mm/emoji/a/c$1;
        ((c.1)localObject1).<init>(this, localc2);
        ((f)localObject2).g((com.tencent.mm.vending.c.a)localObject1);
        AppMethodBeat.o(62245);
        break;
      }
      label324: Object localObject3 = localObject1;
    }
  }

  private void a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(62246);
    b localb;
    if ((this.eyM != null) && (!this.eyS))
    {
      this.eyS = true;
      if (paramInt2 == -434)
      {
        if (!this.eyH)
          break label107;
        localb = b.eyD;
        b.cf(true);
        g.RP().Ry().set(ac.a.xJl, Boolean.TRUE);
      }
      this.eyM.b(paramInt1, paramInt2, paramString, paramBoolean);
      if (paramInt2 == 0)
      {
        if (!this.eyH)
          break label134;
        a.OB().cd(true);
      }
    }
    while (true)
    {
      paramString = b.eyD;
      b.OG();
      AppMethodBeat.o(62246);
      return;
      label107: localb = b.eyD;
      b.ce(true);
      g.RP().Ry().set(ac.a.xJk, Boolean.TRUE);
      break;
      label134: a.OB().cb(true);
      a.OB().ca(true);
    }
  }

  public final void a(c.b paramb)
  {
    this.eyM = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.a.c
 * JD-Core Version:    0.6.2
 */
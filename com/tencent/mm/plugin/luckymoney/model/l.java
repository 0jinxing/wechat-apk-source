package com.tencent.mm.plugin.luckymoney.model;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.luckymoney.a.a.a;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.protocal.protobuf.atc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;

public final class l
  implements com.tencent.mm.plugin.luckymoney.a.a
{
  private static com.tencent.mm.ci.h<com.tencent.mm.at.a.a> nXt;

  static
  {
    AppMethodBeat.i(42325);
    nXt = new com.tencent.mm.ci.h(new l.1());
    AppMethodBeat.o(42325);
  }

  private void a(atb paramatb, int paramInt, l.a parama)
  {
    AppMethodBeat.i(42313);
    ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "get envelope: %s", new Object[] { Integer.valueOf(paramInt) });
    if (paramatb == null)
      AppMethodBeat.o(42313);
    while (true)
    {
      return;
      if (paramatb.cuu > 0)
      {
        int i = paramatb.cuu;
        ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "get bitmap subtype: %s, %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
        String str = m.xR(i);
        n localn = new n();
        localn.field_subtype = i;
        boolean bool = com.tencent.mm.plugin.luckymoney.b.a.bKN().bKM().b(localn, new String[0]);
        Object localObject = null;
        if (bool)
          if (paramInt == 0)
          {
            localObject = new File(str, "bubble.png");
            ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "");
            localObject = f((File)localObject, localn.field_bubbleMd5);
          }
        while (true)
        {
          if (localObject == null)
            com.tencent.mm.plugin.report.service.h.pYm.k(991L, 5L, 1L);
          if ((localObject != null) || (paramatb.wwQ == null))
            break label313;
          ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load subtype fail, try load from url: %s", new Object[] { Integer.valueOf(paramatb.cuu) });
          a(paramatb.wwQ, paramInt, parama);
          AppMethodBeat.o(42313);
          break;
          if ((paramInt == 1) || (paramInt == 2))
          {
            localObject = f(new File(str, "cover.png"), localn.field_coverMd5);
          }
          else if (paramInt == 3)
          {
            localObject = f(new File(str, "minilogo.png"), localn.field_coverMd5);
            continue;
            m.bLy();
            ab.w("MicroMsg.LuckyMoneyEnvelopeLogic", "can't find subtype res: %s", new Object[] { Integer.valueOf(i) });
          }
        }
        label313: parama.a((Bitmap)localObject, paramatb.cuu, "");
        AppMethodBeat.o(42313);
      }
      else if (paramatb.wwQ != null)
      {
        a(paramatb.wwQ, paramInt, parama);
        AppMethodBeat.o(42313);
      }
      else
      {
        ab.w("MicroMsg.LuckyMoneyEnvelopeLogic", "source object is null");
        AppMethodBeat.o(42313);
      }
    }
  }

  private void a(atc paramatc, int paramInt, l.a parama)
  {
    AppMethodBeat.i(42314);
    ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "get bitmap by url: %s", new Object[] { Integer.valueOf(paramInt) });
    if (paramatc == null)
    {
      AppMethodBeat.o(42314);
      return;
    }
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(42314);
      break;
      a(paramatc.wwV, paramatc.wwY, parama);
      AppMethodBeat.o(42314);
      break;
      a(paramatc.wwW, paramatc.wwZ, parama);
      AppMethodBeat.o(42314);
      break;
      a(paramatc.wwX, paramatc.wxa, parama);
      AppMethodBeat.o(42314);
      break;
      a(paramatc.wwU, paramatc.wxb, parama);
    }
  }

  private void a(String paramString1, String paramString2, l.a parama)
  {
    AppMethodBeat.i(42315);
    ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load image: %s, %s", new Object[] { paramString1, paramString2 });
    bLw().a(paramString1, null, bLx().ahG(), new l.3(this, paramString2, parama));
    AppMethodBeat.o(42315);
  }

  private static com.tencent.mm.at.a.a bLw()
  {
    AppMethodBeat.i(42321);
    com.tencent.mm.at.a.a locala = (com.tencent.mm.at.a.a)nXt.get();
    AppMethodBeat.o(42321);
    return locala;
  }

  private static c.a bLx()
  {
    AppMethodBeat.i(42322);
    c.a locala = new c.a();
    com.tencent.mm.plugin.luckymoney.b.a.bKN();
    locala.ePK = com.tencent.mm.plugin.luckymoney.b.a.bKP();
    locala.ePN = com.tencent.mm.bz.a.gd(ah.getContext());
    locala.ePO = com.tencent.mm.bz.a.ge(ah.getContext());
    locala.ePH = true;
    AppMethodBeat.o(42322);
    return locala;
  }

  private static Bitmap f(File paramFile, String paramString)
  {
    AppMethodBeat.i(42316);
    boolean bool1 = paramFile.exists();
    boolean bool2 = paramFile.isFile();
    boolean bool3 = com.tencent.mm.a.g.v(paramFile).equals(paramString);
    ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "get from file: %s, %s, %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
    if ((bool1) && (bool2) && (bool3))
    {
      paramFile = MMBitmapFactory.decodeFile(paramFile.getAbsolutePath());
      AppMethodBeat.o(42316);
    }
    while (true)
    {
      return paramFile;
      if (!bool3)
        com.tencent.mm.plugin.report.service.h.pYm.k(991L, 3L, 1L);
      if (!bool1)
        com.tencent.mm.plugin.report.service.h.pYm.k(991L, 4L, 1L);
      m.bLy();
      paramFile = null;
      AppMethodBeat.o(42316);
    }
  }

  public final void a(ImageView paramImageView, int paramInt1, int paramInt2, atb paramatb, boolean paramBoolean)
  {
    AppMethodBeat.i(42320);
    ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load chatting view: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramImageView == null)
      AppMethodBeat.o(42320);
    while (true)
    {
      return;
      paramImageView.setTag(2131820639, paramatb.wwQ.wwV);
      paramImageView.setTag(2131820638, Integer.valueOf(paramatb.cuu));
      a(paramatb, 0, new l.7(this, paramImageView, paramInt1, paramInt2, paramBoolean));
      AppMethodBeat.o(42320);
    }
  }

  public final void a(ImageView paramImageView, atb paramatb)
  {
    AppMethodBeat.i(42317);
    ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load detail view");
    if ((paramImageView == null) || (paramatb == null))
      AppMethodBeat.o(42317);
    while (true)
    {
      return;
      a(paramatb, 3, new l.4(this, paramImageView));
      AppMethodBeat.o(42317);
    }
  }

  public final void a(ImageView paramImageView, atb paramatb, a.a parama)
  {
    AppMethodBeat.i(42319);
    if ((paramImageView == null) || (paramatb == null))
      AppMethodBeat.o(42319);
    while (true)
    {
      return;
      ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load cover view: %s", new Object[] { paramatb.materialId });
      paramImageView.setTag(2131820639, paramatb.wwQ.wwW);
      paramImageView.setTag(2131820638, Integer.valueOf(paramatb.cuu));
      a(paramatb, 1, new l.6(this, parama, paramImageView));
      AppMethodBeat.o(42319);
    }
  }

  public final void a(atc paramatc)
  {
    AppMethodBeat.i(42312);
    ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "trigger load envelope resources");
    if (paramatc != null)
    {
      if ((!bo.isNullOrNil(paramatc.wwV)) && (!bo.isNullOrNil(paramatc.wwY)))
        a(paramatc.wwV, paramatc.wwY, null);
      if ((!bo.isNullOrNil(paramatc.wwX)) && (!bo.isNullOrNil(paramatc.wxa)))
        a(paramatc.wwX, paramatc.wxa, null);
      if ((!bo.isNullOrNil(paramatc.wwU)) && (!bo.isNullOrNil(paramatc.wxb)))
        a(paramatc.wwU, paramatc.wxb, null);
      if ((!bo.isNullOrNil(paramatc.wwW)) && (!bo.isNullOrNil(paramatc.wwZ)))
        a(paramatc.wwW, paramatc.wwZ, null);
    }
    AppMethodBeat.o(42312);
  }

  public final void b(ImageView paramImageView, atb paramatb)
  {
    AppMethodBeat.i(42318);
    ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load detail view");
    if ((paramImageView == null) || (paramatb == null))
      AppMethodBeat.o(42318);
    while (true)
    {
      return;
      a(paramatb, 2, new l.5(this, paramImageView));
      AppMethodBeat.o(42318);
    }
  }

  public final void bKL()
  {
    AppMethodBeat.i(42311);
    ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "trigger laod envelope after receive");
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUv, Integer.valueOf(1));
    if (!((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUr, Boolean.FALSE)).booleanValue())
    {
      com.tencent.mm.x.c.PK().a(ac.a.xUs, true);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUr, Boolean.TRUE);
    }
    Object localObject = new ag("v1.0", 1, (byte)0);
    com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
    localObject = f.bLp();
    ((f)localObject).b(new c(""));
    ((f)localObject).a(new l.2(this));
    AppMethodBeat.o(42311);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.l
 * JD-Core Version:    0.6.2
 */
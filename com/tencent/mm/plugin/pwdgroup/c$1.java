package com.tencent.mm.plugin.pwdgroup;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.bz.a;
import com.tencent.mm.pluginsdk.ui.i;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.IOException;
import java.lang.ref.WeakReference;

final class c$1
  implements i.a
{
  private Bitmap cdX;
  private f<String, WeakReference<Bitmap>> pqL;

  c$1(c paramc)
  {
    AppMethodBeat.i(23976);
    this.cdX = null;
    try
    {
      this.cdX = BackwardSupportUtil.b.b(ah.getContext().getAssets().open("avatar/default_nor_avatar.png"), a.getDensity(null));
      this.pqL = new com.tencent.mm.memory.a.b(15, getClass());
      AppMethodBeat.o(23976);
      return;
    }
    catch (IOException paramc)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Facing.SubCorePwdGroup", paramc, "", new Object[0]);
    }
  }

  public final Bitmap AZ()
  {
    return this.cdX;
  }

  public final void a(i parami)
  {
    AppMethodBeat.i(23977);
    if ((parami instanceof d.a))
      o.acd().a((d.a)parami);
    AppMethodBeat.o(23977);
  }

  public final Bitmap b(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return null;
  }

  public final Bitmap cQ(String paramString)
  {
    AppMethodBeat.i(23978);
    Object localObject = (WeakReference)this.pqL.get(paramString);
    if ((localObject == null) || (((WeakReference)localObject).get() == null) || (((Bitmap)((WeakReference)localObject).get()).isRecycled()) || (((WeakReference)localObject).get() != AZ()))
    {
      localObject = com.tencent.mm.ah.b.a(paramString, false, -1);
      if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
      {
        paramString = this.cdX;
        AppMethodBeat.o(23978);
      }
    }
    while (true)
    {
      return paramString;
      this.pqL.k(paramString, new WeakReference(localObject));
      paramString = (String)localObject;
      break;
      paramString = (Bitmap)((WeakReference)localObject).get();
      AppMethodBeat.o(23978);
    }
  }

  public final Bitmap cR(String paramString)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.c.1
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.extaccessories;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.samsung.android.sdk.look.writingbuddy.SlookWritingBuddy.ImageWritingListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.g.a.nz;
import com.tencent.mm.g.a.nz.a;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.pluginsdk.ui.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

class SubCoreExtAccessories$RegistSpenBuddyEventListener$1
  implements SlookWritingBuddy.ImageWritingListener
{
  SubCoreExtAccessories$RegistSpenBuddyEventListener$1(b.a parama, nz paramnz)
  {
  }

  public void onImageReceived(Bitmap paramBitmap)
  {
    AppMethodBeat.i(20464);
    ab.i("MicroMsg.extaccessories.SubCoreExtAccessories", "onImageReceived");
    if (paramBitmap == null)
    {
      ab.e("MicroMsg.extaccessories.SubCoreExtAccessories", "img is null");
      this.lRG.cKo.cKp.ajv(null);
      AppMethodBeat.o(20464);
    }
    while (true)
    {
      return;
      if (!f.Mn())
      {
        ab.e("MicroMsg.extaccessories.SubCoreExtAccessories", "SDCard not available");
        this.lRG.cKo.cKp.ajv(null);
        AppMethodBeat.o(20464);
      }
      else
      {
        aw.ZE();
        Object localObject1 = (b)bw.oJ("plugin.extaccessories");
        Object localObject2 = localObject1;
        if (localObject1 == null)
        {
          ab.w("MicroMsg.extaccessories.SubCoreExtAccessories", "not found in MMCore, new one");
          localObject2 = new b();
          aw.ZE().a("plugin.extaccessories", (at)localObject2);
        }
        localObject1 = System.currentTimeMillis();
        if ((aw.RK()) && (!bo.isNullOrNil((String)localObject1)));
        for (localObject2 = ((b)localObject2).eJM + "image/spen/spen_" + (String)localObject1; ; localObject2 = "")
        {
          if (!bo.isNullOrNil((String)localObject2))
            break label231;
          ab.e("MicroMsg.extaccessories.SubCoreExtAccessories", "filePath is null");
          this.lRG.cKo.cKp.ajv(null);
          AppMethodBeat.o(20464);
          break;
        }
        try
        {
          label231: if (paramBitmap.getWidth() <= 1000)
          {
            localObject1 = paramBitmap;
            if (paramBitmap.getHeight() <= 1000);
          }
          else
          {
            ab.d("MicroMsg.extaccessories.SubCoreExtAccessories", "spen image %d, %d, need scale", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()) });
            Bitmap localBitmap = Bitmap.createScaledBitmap(paramBitmap, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2, true);
            localObject1 = paramBitmap;
            if (paramBitmap != localBitmap)
            {
              localObject1 = paramBitmap;
              if (localBitmap != null)
              {
                ab.i("MicroMsg.extaccessories.SubCoreExtAccessories", "bitmap recycle %s", new Object[] { paramBitmap.toString() });
                paramBitmap.recycle();
                localObject1 = localBitmap;
              }
            }
          }
          d.a((Bitmap)localObject1, 55, Bitmap.CompressFormat.JPEG, (String)localObject2, true);
          ab.d("MicroMsg.extaccessories.SubCoreExtAccessories", "save spen temp image : %s", new Object[] { localObject2 });
          this.lRG.cKo.cKp.ajv((String)localObject2);
          AppMethodBeat.o(20464);
        }
        catch (Exception paramBitmap)
        {
          ab.e("MicroMsg.extaccessories.SubCoreExtAccessories", "Exception %s", new Object[] { paramBitmap.getMessage() });
          ab.printErrStackTrace("MicroMsg.extaccessories.SubCoreExtAccessories", paramBitmap, "", new Object[0]);
          this.lRG.cKo.cKp.ajv(null);
          AppMethodBeat.o(20464);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extaccessories.SubCoreExtAccessories.RegistSpenBuddyEventListener.1
 * JD-Core Version:    0.6.2
 */
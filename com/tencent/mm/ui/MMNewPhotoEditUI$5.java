package com.tencent.mm.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.n;
import com.tencent.mm.api.p;
import com.tencent.mm.api.s;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;

final class MMNewPhotoEditUI$5
  implements n
{
  MMNewPhotoEditUI$5(MMNewPhotoEditUI paramMMNewPhotoEditUI, int paramInt)
  {
  }

  public final void b(Bitmap paramBitmap, boolean paramBoolean)
  {
    AppMethodBeat.i(11926);
    ab.i("MicroMsg.MMNewPhotoEditUI", "[onSuccess] w:%s h:%s", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()) });
    try
    {
      str = a.RL("jpg");
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, str, true);
      ab.i("MicroMsg.MMNewPhotoEditUI", "[onSuccess] photoPath:%s", new Object[] { str });
      MMNewPhotoEditUI.f(this.ynz).recordImage(MMNewPhotoEditUI.c(this.ynz), str, MMNewPhotoEditUI.d(this.ynz), MMNewPhotoEditUI.e(this.ynz).Ac().Az(), MMNewPhotoEditUI.e(this.ynz).Ac().AA());
      if ((MMNewPhotoEditUI.g(this.ynz)) || (this.val$index == 2))
        a.a(str, this.ynz);
      if ((this.val$index != 0) && (!paramBitmap.isRecycled()))
      {
        ab.i("MicroMsg.MMNewPhotoEditUI", "bitmap recycle %s", new Object[] { paramBitmap.toString() });
        paramBitmap.recycle();
      }
      MMNewPhotoEditUI.a(this.ynz, str);
      if ((MMNewPhotoEditUI.h(this.ynz) == 291) || (MMNewPhotoEditUI.h(this.ynz) == 293))
      {
        if (this.val$index == 0)
        {
          MMNewPhotoEditUI.b(this.ynz, str);
          MMNewPhotoEditUI.b(this.ynz);
          MMNewPhotoEditUI.b(this.ynz, 1);
          AppMethodBeat.o(11926);
        }
        while (true)
        {
          return;
          if (this.val$index != 1)
            break;
          MMNewPhotoEditUI.c(this.ynz, str);
          MMNewPhotoEditUI.b(this.ynz, 2);
          Toast.makeText(ah.getContext(), this.ynz.getString(2131305893), 1).show();
          MMNewPhotoEditUI.b(this.ynz);
          this.ynz.finish();
          AppMethodBeat.o(11926);
        }
      }
    }
    catch (IOException paramBitmap)
    {
      while (true)
      {
        String str;
        onError(paramBitmap);
        AppMethodBeat.o(11926);
        continue;
        if (this.val$index == 2)
        {
          Toast.makeText(ah.getContext(), this.ynz.getString(2131305889, new Object[] { e.euR }), 1).show();
          MMNewPhotoEditUI.b(this.ynz, 3);
          MMNewPhotoEditUI.b(this.ynz);
          this.ynz.finish();
          AppMethodBeat.o(11926);
          continue;
          MMNewPhotoEditUI.d(this.ynz, str);
        }
        else
        {
          AppMethodBeat.o(11926);
        }
      }
    }
  }

  public final void onError(Exception paramException)
  {
    AppMethodBeat.i(11925);
    MMNewPhotoEditUI.b(this.ynz);
    ab.e("MicroMsg.MMNewPhotoEditUI", "[onRefreshed] %s", new Object[] { paramException });
    Toast.makeText(ah.getContext(), this.ynz.getResources().getString(2131305886), 1).show();
    this.ynz.setResult(0);
    this.ynz.finish();
    AppMethodBeat.o(11925);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMNewPhotoEditUI.5
 * JD-Core Version:    0.6.2
 */
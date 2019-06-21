package com.tencent.mm.plugin.wallet_core.utils;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

final class a$b
  implements x.a
{
  String tKb;
  WeakReference<ImageView> tPb;
  WeakReference<View> tPc = null;
  WeakReference<ImageView> tPd = null;
  WeakReference<TextView> tPe = null;
  boolean tPf = false;
  Bankcard thJ;

  public final void m(String paramString, Bitmap paramBitmap)
  {
    boolean bool1 = true;
    AppMethodBeat.i(47997);
    Object localObject = new StringBuilder("onGetPictureFinish ").append(paramString).append(", bitmap = ");
    boolean bool2;
    if (paramBitmap == null)
    {
      bool2 = true;
      ab.d("MicroMsg.BankcardLogoHelper", bool2);
      if (!TextUtils.isEmpty(this.tKb))
        break label78;
      ab.e("MicroMsg.BankcardLogoHelper", "mBankcardLogoUrl is empty");
      AppMethodBeat.o(47997);
    }
    while (true)
    {
      return;
      bool2 = false;
      break;
      label78: if (this.tPb != null)
      {
        ImageView localImageView = (ImageView)this.tPb.get();
        if (paramBitmap == null)
        {
          bool2 = true;
          label104: if (localImageView != null)
            break label296;
          label109: if (localImageView != null)
            break label301;
        }
        for (localObject = ""; ; localObject = localImageView.getTag())
        {
          ab.d("MicroMsg.BankcardLogoHelper", "onGetPictureFinish done notifyKey %s  bitmap is null? %s iv is null? %s iv tag: %s mBankcardLogoUrl %s, checkTagType: %s", new Object[] { paramString, Boolean.valueOf(bool2), Boolean.valueOf(bool1), localObject, this.tKb, Boolean.valueOf(this.tPf) });
          if ((localImageView == null) || (paramString == null) || (!paramString.equals(this.tKb)))
            break label336;
          if (!this.tPf)
            break label311;
          if ((localImageView.getTag(2131820688) == null) || (this.thJ == null) || (this.thJ.field_bankcardType == null))
            break label336;
          paramString = (String)localImageView.getTag(2131820688);
          if ((!bo.isNullOrNil(paramString)) && (paramString.equals(this.thJ.field_bankcardType)))
          {
            localImageView.post(new a.b.1(this, localImageView, paramBitmap));
            localImageView.setTag(2131820688, null);
          }
          AppMethodBeat.o(47997);
          break;
          bool2 = false;
          break label104;
          bool1 = false;
          break label109;
        }
        localImageView.post(new a.b.2(this, localImageView, paramBitmap));
        localImageView.setTag(2131820688, null);
      }
      label296: label301: label311: label336: AppMethodBeat.o(47997);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a.b
 * JD-Core Version:    0.6.2
 */
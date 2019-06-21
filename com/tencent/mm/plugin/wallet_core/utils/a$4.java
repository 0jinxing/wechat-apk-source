package com.tencent.mm.plugin.wallet_core.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.wallet_core.ui.view.b;
import com.tencent.mm.plugin.wallet_core.ui.view.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

final class a$4
  implements Runnable
{
  a$4(a parama, View paramView, com.tencent.mm.plugin.wallet_core.model.e parame, a.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47987);
    this.tOX.invalidate();
    Object localObject = this.tOW.txp;
    int i;
    if ("http://res.wx.qq.com/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_bule_bg.9_v2.png".equals(localObject))
    {
      i = 2130840662;
      if (i == -1)
        break label201;
      this.tOX.setBackgroundResource(i);
      localObject = BitmapFactory.decodeResource(this.tOX.getResources(), i);
      i = ((Bitmap)localObject).getPixel(((Bitmap)localObject).getWidth() / 2, ((Bitmap)localObject).getHeight() / 2);
      ab.d("MicroMsg.BankcardLogoHelper", "local bg color: %s", new Object[] { Integer.valueOf(i) });
      localObject = (TextView)this.tOU.tPe.get();
      if (localObject != null)
        ((TextView)localObject).setTextColor(i);
      AppMethodBeat.o(47987);
    }
    while (true)
    {
      return;
      if ("http://res.wx.qq.com/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_green_bg.9_v2.png".equals(localObject))
      {
        i = 2130840666;
        break;
      }
      if ("http://res.wx.qq.com/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_hbule_bg.9_v2.png".equals(localObject))
      {
        i = 2130840668;
        break;
      }
      if ("http://res.wx.qq.com/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_purple_bg.9_v2.png".equals(localObject))
      {
        i = 2130840673;
        break;
      }
      if ("http://res.wx.qq.com/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_red_bg.9_v2.png".equals(localObject))
      {
        i = 2130840674;
        break;
      }
      if ("http://res.wx.qq.com/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_yellow_bg.9_v2.png".equals(localObject))
      {
        i = 2130840679;
        break;
      }
      i = -1;
      break;
      label201: c localc;
      if (!bo.isNullOrNil(this.tOW.txp))
      {
        localc = new c(this.tOW.txp);
        localObject = x.a(localc);
        x.a(this.tOU);
        if (localObject == null);
      }
      try
      {
        byte[] arrayOfByte = ((Bitmap)localObject).getNinePatchChunk();
        if ((arrayOfByte == null) || (!NinePatch.isNinePatchChunk(arrayOfByte)))
          com.tencent.mm.vfs.e.deleteFile(localc.anJ());
        label273: if (localObject != null)
        {
          this.tOX.setBackgroundDrawable(b.b(this.tOX.getContext(), (Bitmap)localObject));
          i = ((Bitmap)localObject).getPixel(((Bitmap)localObject).getWidth() / 2, ((Bitmap)localObject).getHeight() / 2);
          localObject = (TextView)this.tOU.tPe.get();
          if (localObject != null)
          {
            ab.d("MicroMsg.BankcardLogoHelper", "server bg color: %s", new Object[] { Integer.valueOf(i) });
            ((TextView)localObject).setTextColor(i);
          }
        }
        AppMethodBeat.o(47987);
        continue;
        if (this.tOW.txt > 0)
          this.tOX.setBackgroundResource(this.tOW.txt);
        AppMethodBeat.o(47987);
      }
      catch (Exception localException)
      {
        break label273;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a.4
 * JD-Core Version:    0.6.2
 */
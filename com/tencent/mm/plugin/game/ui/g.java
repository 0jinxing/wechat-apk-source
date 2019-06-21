package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public final class g extends m
{
  public g(Context paramContext)
  {
    super(paramContext);
    this.nkj = 2130969683;
  }

  protected final void a(c paramc, m.b paramb)
  {
  }

  protected final void a(c paramc, m.b paramb, int paramInt)
  {
    AppMethodBeat.i(111760);
    paramb.nku.setText(paramc.position);
    Bitmap localBitmap = Oi(paramc.field_appId);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      paramb.nkv.setImageBitmap(localBitmap);
      paramb.njw.setText(paramc.field_appName);
      if (!bo.isNullOrNil(paramc.mVk))
        break label235;
      paramb.nky.setVisibility(8);
      label91: if (bo.ek(paramc.mVu))
        break label257;
      paramb.nkw.setVisibility(0);
      paramb.nkw.setText((CharSequence)paramc.mVu.get(0));
    }
    while (true)
    {
      paramb.nkA.setTextSize(this.ngM);
      paramb.nkz.setOnClickListener(this.nhC);
      paramb.nkA.setOnClickListener(this.nhC);
      paramb.nkz.setTag(paramc);
      paramb.nkA.setTag(paramc);
      this.ngR.a(paramb.nkA, paramb.nkz, paramc, (k)this.nko.get(paramc.field_appId));
      paramb.nkB.setData(paramc.mVs);
      AppMethodBeat.o(111760);
      return;
      paramb.nkv.setImageResource(2130838911);
      break;
      label235: paramb.nky.setVisibility(0);
      paramb.nky.setText(paramc.mVk);
      break label91;
      label257: if (!bo.isNullOrNil(paramc.mVx))
      {
        paramb.nkw.setVisibility(0);
        paramb.nkw.setText(paramc.mVx);
      }
      try
      {
        paramb.nkw.setBackgroundDrawable(e.dI(Color.parseColor(paramc.mVy), a.fromDPToPix(this.mContext, 10)));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        ab.e("MicroMsg.GameCenterListAdapter", localIllegalArgumentException.getMessage());
        paramb.nkw.setVisibility(8);
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.GameCenterListAdapter", localException.getMessage());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.g
 * JD-Core Version:    0.6.2
 */
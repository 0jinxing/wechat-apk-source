package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public final class l extends m
{
  public l(Context paramContext)
  {
    super(paramContext);
    this.nkj = 2130969742;
  }

  protected final void a(c paramc, m.b paramb)
  {
    AppMethodBeat.i(112014);
    paramb.nkD.removeAllViews();
    if (!bo.isNullOrNil(paramc.mVn))
    {
      View localView = View.inflate(this.mContext, 2130969723, null);
      ImageView localImageView = (ImageView)localView.findViewById(2131824522);
      com.tencent.mm.at.a.a locala = o.ahp();
      String str = paramc.mVn;
      paramc = new c.a();
      paramc.ePG = true;
      locala.a(str, localImageView, paramc.ahG());
      paramb.nkD.addView(localView, new ViewGroup.LayoutParams(-1, com.tencent.mm.bz.a.fromDPToPix(this.mContext, 100)));
    }
    AppMethodBeat.o(112014);
  }

  protected final void a(c paramc, m.b paramb, int paramInt)
  {
    AppMethodBeat.i(112013);
    paramb.nku.setText(paramc.position);
    Object localObject = paramb.nku;
    int i;
    if (this.nkl)
    {
      i = 0;
      ((TextView)localObject).setVisibility(i);
      localObject = Oi(paramc.field_appId);
      if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
        break label323;
      paramb.nkv.setImageBitmap((Bitmap)localObject);
      label84: paramb.njw.setText(paramc.field_appName);
      if (!bo.isNullOrNil(paramc.mVj))
        break label336;
      paramb.nkx.setVisibility(8);
      label114: if (!bo.isNullOrNil(paramc.mVk))
        break label358;
      paramb.nky.setVisibility(8);
      label133: if (bo.ek(paramc.mVu))
        break label380;
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
      paramb.nkC.removeAllViews();
      paramc = (View)this.nkp.get(paramInt);
      if (paramc != null)
      {
        if ((paramc.getParent() instanceof ViewGroup))
          ((ViewGroup)paramc.getParent()).removeAllViews();
        paramb.nkC.addView(paramc);
      }
      AppMethodBeat.o(112013);
      return;
      i = 8;
      break;
      label323: paramb.nkv.setImageResource(2130838911);
      break label84;
      label336: paramb.nkx.setVisibility(0);
      paramb.nkx.setText(paramc.mVj);
      break label114;
      label358: paramb.nky.setVisibility(0);
      paramb.nky.setText(paramc.mVk);
      break label133;
      label380: if (!bo.isNullOrNil(paramc.mVx))
      {
        paramb.nkw.setVisibility(0);
        paramb.nkw.setText(paramc.mVx);
      }
      try
      {
        paramb.nkw.setBackgroundDrawable(e.dI(Color.parseColor(paramc.mVy), com.tencent.mm.bz.a.fromDPToPix(this.mContext, 10)));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        ab.e("MicroMsg.GameLibraryListAdapter", localIllegalArgumentException.getMessage());
        paramb.nkw.setVisibility(8);
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.GameLibraryListAdapter", localException.getMessage());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.l
 * JD-Core Version:    0.6.2
 */
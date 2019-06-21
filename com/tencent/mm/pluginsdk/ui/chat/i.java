package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.o;
import java.util.ArrayList;

public final class i
{
  Bitmap bitmap;
  ImageView cDh;
  private View contentView;
  private Context context;
  SharedPreferences ehZ;
  View jWH;
  View nOh;
  private h vor;
  g vos;
  o vot;
  boolean vou;
  h.a vov;
  a vow;

  public i(Context paramContext, View paramView1, View paramView2, a parama)
  {
    AppMethodBeat.i(27960);
    this.contentView = null;
    this.cDh = null;
    this.bitmap = null;
    this.vou = true;
    this.context = paramContext;
    this.jWH = paramView1;
    this.nOh = paramView2;
    this.vor = new h(this.context);
    this.ehZ = paramContext.getSharedPreferences(ah.doA(), 0);
    this.vow = parama;
    this.contentView = View.inflate(this.context, 2130969023, null);
    this.cDh = ((ImageView)this.contentView.findViewById(2131822438));
    this.vot = new o(this.contentView, -2, -2, true);
    this.vot.setBackgroundDrawable(new ColorDrawable(0));
    this.vot.setOutsideTouchable(true);
    this.contentView.setOnClickListener(new i.1(this));
    AppMethodBeat.o(27960);
  }

  final float Li(int paramInt)
  {
    AppMethodBeat.i(27963);
    float f = TypedValue.applyDimension(1, paramInt, this.context.getResources().getDisplayMetrics());
    AppMethodBeat.o(27963);
    return f;
  }

  public final void dkJ()
  {
    AppMethodBeat.i(27961);
    i.2 local2 = new i.2(this, this.context.getMainLooper());
    aw.RS().aa(new i.3(this, local2));
    AppMethodBeat.o(27961);
  }

  public final String dkK()
  {
    try
    {
      AppMethodBeat.i(27962);
      Object localObject1;
      if (this.vor == null)
      {
        ab.d("MicroMsg.RecentImageBubble", "because of imageQuery == null");
        localObject1 = null;
        this.vos = ((g)localObject1);
        if (this.vos != null)
          break label270;
        AppMethodBeat.o(27962);
        localObject1 = null;
      }
      while (true)
      {
        return localObject1;
        localObject1 = this.vor.dkI();
        if ((localObject1 == null) || (((ArrayList)localObject1).size() == 0))
        {
          ab.d("MicroMsg.RecentImageBubble", "because of items == null || items.size() == 0");
          localObject1 = null;
          break;
        }
        g localg = (g)((ArrayList)localObject1).get(0);
        int i;
        if (localg != null)
        {
          if (bo.fp(localg.voq) < 0L);
          for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label138;
            ab.e("MicroMsg.RecentImageBubble", "we found u have a future pic that lead to forbid this featur. file : %s", new Object[] { localg.vop });
            localObject1 = null;
            break;
          }
        }
        label138: if ((localg != null) && (localg.vop != null) && (localg.vop.contains(e.eSm)))
        {
          localObject1 = null;
          break;
        }
        if (localg != null)
        {
          if (bo.fp(localg.voq) <= 30L);
          for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label233;
            localObject1 = localg;
            if (!this.ehZ.getString("chattingui_recent_shown_image_path", "").equals(localg.vop))
              break;
            ab.d("MicroMsg.RecentImageBubble", "because of recentImage.equals(imageItem.orginalPath)");
            localObject1 = null;
            break;
          }
        }
        label233: if (localg == null);
        for (boolean bool = true; ; bool = false)
        {
          ab.d("MicroMsg.RecentImageBubble", "because of checkAddDate(generateDate) == false, or imageItem == null : %s", new Object[] { Boolean.valueOf(bool) });
          localObject1 = null;
          break;
        }
        label270: localObject1 = this.vos.thumbPath;
        if (this.vos.thumbPath == null)
          localObject1 = this.vos.vop;
        AppMethodBeat.o(27962);
      }
    }
    finally
    {
    }
  }

  public static abstract interface a
  {
    public abstract void ajI(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.i
 * JD-Core Version:    0.6.2
 */
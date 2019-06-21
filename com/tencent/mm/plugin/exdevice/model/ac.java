package com.tencent.mm.plugin.exdevice.model;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import android.graphics.drawable.shapes.RectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.a.d.b;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.h;
import java.io.File;
import java.io.IOException;
import java.util.List;

public final class ac
{
  private Context context;
  boolean eVT;
  private View ltW;
  private TextView ltX;
  private TextView ltY;
  private TextView ltZ;
  private TextView lua;
  private View lub;
  boolean luc;
  Dialog lud;
  private int width;

  public static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(19380);
    z.aeR();
    Object localObject = e.aew();
    String str;
    if (((List)localObject).size() > 0)
    {
      localObject = (String)((List)localObject).get(0);
      WXImageObject localWXImageObject = new WXImageObject();
      localWXImageObject.setImagePath(paramString2);
      str = s.mJ((String)localObject);
      WXMediaMessage localWXMediaMessage = new WXMediaMessage();
      localWXMediaMessage.mediaObject = localWXImageObject;
      localWXMediaMessage.title = str;
      localWXMediaMessage.description = paramString4;
      localWXMediaMessage.setThumbImage(d.decodeFile(paramString2, null));
      paramString2 = new py();
      paramString2.cMe.cEl = localWXMediaMessage;
      paramString2.cMe.appId = "wx7fa037cc7dfabad5";
      paramString2.cMe.appName = paramContext.getString(2131299400);
      paramString2.cMe.toUser = paramString1;
      paramString2.cMe.cMf = 2;
      if (!bo.isNullOrNil((String)localObject))
        break label253;
      paramString2.cMe.cMi = null;
    }
    while (true)
    {
      boolean bool = com.tencent.mm.sdk.b.a.xxA.m(paramString2);
      if (!bo.isNullOrNil(paramString3))
      {
        paramContext = new qb();
        paramContext.cMq.cMr = paramString1;
        paramContext.cMq.content = paramString3;
        paramContext.cMq.type = t.nK(paramString1);
        paramContext.cMq.flags = 0;
        com.tencent.mm.sdk.b.a.xxA.m(paramContext);
      }
      AppMethodBeat.o(19380);
      return bool;
      localObject = null;
      break;
      label253: paramString2.cMe.cMg = ((String)localObject);
      paramString2.cMe.cMh = str;
    }
  }

  public static final String dG(Context paramContext)
  {
    AppMethodBeat.i(19377);
    paramContext = new File(paramContext.getCacheDir(), "sport_share_bitmap.jpg").getAbsolutePath();
    AppMethodBeat.o(19377);
    return paramContext;
  }

  final String L(Bitmap paramBitmap)
  {
    AppMethodBeat.i(19379);
    if (paramBitmap != null)
      paramBitmap = ae.ao(paramBitmap);
    while (true)
    {
      Object localObject = new ac.3(this, paramBitmap);
      PaintDrawable localPaintDrawable = new PaintDrawable();
      localPaintDrawable.setShape(new RectShape());
      localPaintDrawable.setShaderFactory((ShapeDrawable.ShaderFactory)localObject);
      this.lub.setBackgroundDrawable(localPaintDrawable);
      this.ltX.setTextColor(paramBitmap[1]);
      this.ltY.setTextColor(paramBitmap[1]);
      this.ltZ.setTextColor(paramBitmap[1]);
      this.lua.setTextColor(paramBitmap[1]);
      localObject = Bitmap.createBitmap(this.width, this.width, Bitmap.Config.ARGB_8888);
      paramBitmap = new Canvas((Bitmap)localObject);
      this.ltW.draw(paramBitmap);
      paramBitmap = new File(dG(this.context));
      if (paramBitmap.exists())
        paramBitmap.delete();
      try
      {
        d.a((Bitmap)localObject, 100, Bitmap.CompressFormat.JPEG, paramBitmap.getAbsolutePath(), true);
        label170: paramBitmap = paramBitmap.getAbsolutePath();
        AppMethodBeat.o(19379);
        return paramBitmap;
        paramBitmap = new int[2];
        Bitmap tmp188_187 = paramBitmap;
        tmp188_187[0] = -1;
        Bitmap tmp192_188 = tmp188_187;
        tmp192_188[1] = -16777216;
        tmp192_188;
      }
      catch (IOException localIOException)
      {
        break label170;
      }
    }
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, final ac.a parama)
  {
    AppMethodBeat.i(19378);
    if (this.luc)
      AppMethodBeat.o(19378);
    while (true)
    {
      return;
      this.luc = true;
      this.eVT = false;
      if ((this.lud == null) && (!bo.isNullOrNil(paramString3)))
      {
        paramContext.getString(2131297061);
        this.lud = h.b(paramContext, paramContext.getString(2131299385), true, new ac.1(this));
        this.lud.show();
      }
      this.context = paramContext;
      this.width = 1280;
      if (this.width > com.tencent.mm.bz.a.gd(paramContext))
        this.width = com.tencent.mm.bz.a.gd(paramContext);
      this.ltW = LayoutInflater.from(paramContext).inflate(2130969449, null);
      this.ltX = ((TextView)this.ltW.findViewById(2131823719));
      this.ltY = ((TextView)this.ltW.findViewById(2131823732));
      this.ltZ = ((TextView)this.ltW.findViewById(2131823730));
      this.lua = ((TextView)this.ltW.findViewById(2131823733));
      this.lub = this.ltW.findViewById(2131823728);
      this.ltX.setText(paramString1);
      this.ltZ.setText(paramString2);
      a.b.a((ImageView)this.ltW.findViewById(2131823652), r.Yz(), 0.5F, false);
      paramContext = (ImageView)this.ltW.findViewById(2131823727);
      paramString1 = new RelativeLayout.LayoutParams(-1, -1);
      this.ltW.setLayoutParams(paramString1);
      this.ltW.measure(View.MeasureSpec.makeMeasureSpec(this.width, 1073741824), View.MeasureSpec.makeMeasureSpec(this.width, 1073741824));
      this.ltW.layout(0, 0, this.width, this.width);
      if (!bo.isNullOrNil(paramString3))
      {
        ad.boZ().a(paramString3, paramContext, new g()
        {
          public final Bitmap a(String paramAnonymousString, View paramAnonymousView, b paramAnonymousb)
          {
            return null;
          }

          public final void b(String paramAnonymousString, View paramAnonymousView, b paramAnonymousb)
          {
            AppMethodBeat.i(19375);
            if (ac.this.eVT)
            {
              ac.this.luc = false;
              AppMethodBeat.o(19375);
            }
            while (true)
            {
              return;
              al.d(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(19374);
                  if (ac.this.lud.isShowing())
                    ac.this.lud.dismiss();
                  AppMethodBeat.o(19374);
                }
              });
              paramAnonymousString = ac.this.L(paramAnonymousb.bitmap);
              parama.Kj(paramAnonymousString);
              ac.this.luc = false;
              AppMethodBeat.o(19375);
            }
          }

          public final void sH(String paramAnonymousString)
          {
          }
        });
        AppMethodBeat.o(19378);
      }
      else
      {
        paramContext.setImageResource(2131689920);
        parama.Kj(L(null));
        this.luc = false;
        AppMethodBeat.o(19378);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ac
 * JD-Core Version:    0.6.2
 */
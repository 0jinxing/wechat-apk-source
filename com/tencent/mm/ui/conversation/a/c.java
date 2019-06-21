package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.platformtools.f;
import com.tencent.mm.pluginsdk.h.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;
import java.util.Map<Ljava.lang.String;Ljava.lang.String;>;
import junit.framework.Assert;

public final class c
{
  com.tencent.mm.pluginsdk.h.a.a zvS;

  c(com.tencent.mm.pluginsdk.h.a.a parama)
  {
    this.zvS = parama;
  }

  private static Drawable a(Map<String, String> paramMap, Context paramContext)
  {
    AppMethodBeat.i(34644);
    if ((paramMap == null) || (paramMap.size() <= 0))
    {
      AppMethodBeat.o(34644);
      paramMap = null;
    }
    while (true)
    {
      return paramMap;
      Object localObject1 = paramContext.getResources().getDisplayMetrics();
      Object localObject2 = (String)paramMap.get(((DisplayMetrics)localObject1).heightPixels + "x" + ((DisplayMetrics)localObject1).widthPixels);
      localObject1 = localObject2;
      label134: Object localObject3;
      if (localObject2 == null)
      {
        new f();
        localObject1 = paramContext.getResources().getDisplayMetrics();
        localObject2 = paramContext.getResources().getConfiguration();
        if (((DisplayMetrics)localObject1).density >= 1.0F)
          break label197;
        localObject1 = "" + "LDPI";
        localObject3 = new StringBuilder().append((String)localObject1);
        if (((Configuration)localObject2).orientation != 2)
          break label255;
      }
      label197: label255: for (localObject1 = "_L"; ; localObject1 = "_P")
      {
        localObject1 = (String)paramMap.get((String)localObject1);
        if (ah.nullAsNil((String)localObject1).length() > 0)
          break label261;
        AppMethodBeat.o(34644);
        paramMap = null;
        break;
        if (((DisplayMetrics)localObject1).density >= 1.5F)
        {
          localObject1 = "" + "HDPI";
          break label134;
        }
        localObject1 = "" + "MDPI";
        break label134;
      }
      label261: localObject2 = com.tencent.mm.pluginsdk.h.a.a.ajl((String)localObject1);
      if (localObject2 == a.a.vfR)
      {
        AppMethodBeat.o(34644);
        paramMap = null;
      }
      else
      {
        localObject3 = com.tencent.mm.pluginsdk.h.a.a.ajk((String)localObject1);
        if (ah.nullAsNil((String)localObject3).length() <= 0)
        {
          AppMethodBeat.o(34644);
          paramMap = null;
        }
        else
        {
          try
          {
            float f;
            if (localObject2 == a.a.vfP)
            {
              paramMap = paramContext.getAssets().open((String)localObject3);
              f = com.tencent.mm.bz.a.getDensity(paramContext);
              new f();
              paramMap = com.tencent.mm.sdk.platformtools.d.a(paramMap, f);
            }
            while (true)
            {
              if (paramMap != null)
                break label457;
              paramMap = new java/lang/StringBuilder;
              paramMap.<init>("get Bitmap failed type:");
              ab.e("MicroMsg.ADListView.Message", localObject2 + " path:" + (String)localObject3);
              AppMethodBeat.o(34644);
              paramMap = null;
              break;
              f = com.tencent.mm.bz.a.getDensity(paramContext);
              new f();
              localObject1 = com.tencent.mm.sdk.platformtools.d.j((String)localObject3, f);
              paramMap = (Map<String, String>)localObject1;
              if (localObject1 != null)
              {
                ((Bitmap)localObject1).setDensity((int)(160.0F * f));
                paramMap = (Map<String, String>)localObject1;
              }
            }
          }
          catch (Exception paramMap)
          {
            ab.printErrStackTrace("MicroMsg.ADListView.Message", paramMap, "", new Object[0]);
            AppMethodBeat.o(34644);
            paramMap = null;
          }
          continue;
          label457: localObject1 = paramMap.getNinePatchChunk();
          if ((localObject1 != null) && (NinePatch.isNinePatchChunk((byte[])localObject1)))
          {
            paramContext = new android/graphics/Rect;
            paramContext.<init>();
            paramMap = new NinePatchDrawable(paramMap, (byte[])localObject1, paramContext, null);
            AppMethodBeat.o(34644);
          }
          else
          {
            localObject2 = paramContext.getResources().getDisplayMetrics();
            localObject1 = Bitmap.createScaledBitmap(paramMap, ((DisplayMetrics)localObject2).widthPixels, ((DisplayMetrics)localObject2).widthPixels * paramMap.getHeight() / paramMap.getWidth(), true);
            paramContext = paramMap;
            if (localObject1 != null)
            {
              if (paramMap != localObject1)
              {
                ab.i("MicroMsg.ADListView.Message", "recycle bitmap:%s", new Object[] { paramMap });
                paramMap.recycle();
              }
              paramContext = (Context)localObject1;
            }
            paramMap = new android/graphics/drawable/BitmapDrawable;
            paramMap.<init>(paramContext);
            paramMap.setTargetDensity((DisplayMetrics)localObject2);
            AppMethodBeat.o(34644);
          }
        }
      }
    }
  }

  public final int a(d paramd)
  {
    boolean bool1 = true;
    int i = 0;
    AppMethodBeat.i(34643);
    if (paramd != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (paramd.zvU == null)
        break label77;
    }
    Drawable localDrawable;
    label77: for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      localDrawable = a(this.zvS.vfN, paramd.zvT.getContext());
      if (localDrawable != null)
        break label83;
      j = -1;
      AppMethodBeat.o(34643);
      return j;
      bool2 = false;
      break;
    }
    label83: paramd.zvT.setBackgroundDrawable(localDrawable);
    paramd = paramd.zvU;
    if (this.zvS.vfI);
    for (int j = 0; ; j = 8)
    {
      paramd.setVisibility(j);
      AppMethodBeat.o(34643);
      j = i;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.c
 * JD-Core Version:    0.6.2
 */
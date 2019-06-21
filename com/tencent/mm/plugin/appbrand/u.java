package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class u
{
  private static Intent a(Context paramContext, a parama, int paramInt, Bitmap paramBitmap, boolean paramBoolean)
  {
    String str = null;
    AppMethodBeat.i(129119);
    if ((parama == null) || (paramContext == null) || (parama.userName == null))
    {
      ab.e("MicroMsg.AppBrandShortcutManager", "buildIntent, wrong parameters");
      AppMethodBeat.o(129119);
    }
    for (paramContext = str; ; paramContext = str)
    {
      return paramContext;
      if ((paramBitmap != null) || (!paramBoolean))
        break;
      ab.e("MicroMsg.AppBrandShortcutManager", "no bmp");
      AppMethodBeat.o(129119);
    }
    if (TextUtils.isEmpty(parama.nickname))
    {
      str = parama.userName;
      label83: parama = t.auu().a(paramContext.getPackageName(), paramInt, parama.userName, parama.nickname, parama.bQQ, parama.appId, parama.uin, 1);
      if (!paramBoolean)
        break label191;
    }
    label191: for (paramContext = "com.android.launcher.action.INSTALL_SHORTCUT"; ; paramContext = "com.android.launcher.action.UNINSTALL_SHORTCUT")
    {
      paramContext = new Intent(paramContext);
      paramContext.putExtra("android.intent.extra.shortcut.NAME", str);
      paramContext.putExtra("duplicate", false);
      paramContext.putExtra("android.intent.extra.shortcut.INTENT", parama);
      paramContext.putExtra("android.intent.extra.shortcut.ICON", paramBitmap);
      paramContext.putExtra("shortcut_is_adaptive_icon", true);
      AppMethodBeat.o(129119);
      break;
      str = parama.nickname;
      break label83;
    }
  }

  private static Bitmap a(Context paramContext, Bitmap paramBitmap, int paramInt)
  {
    Object localObject = null;
    Bitmap localBitmap = null;
    AppMethodBeat.i(129121);
    if ((paramContext == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      AppMethodBeat.o(129121);
      paramBitmap = localBitmap;
      return paramBitmap;
    }
    int i = (int)(a.getDensity(paramContext) * 48.0F);
    localBitmap = Bitmap.createScaledBitmap(paramBitmap, i, i, false);
    paramBitmap = localObject;
    if (localBitmap != null)
    {
      paramBitmap = localBitmap.copy(Bitmap.Config.ARGB_8888, true);
      ab.i("MicroMsg.AppBrandShortcutManager", "bitmap recycle %s", new Object[] { localBitmap });
      localBitmap.recycle();
    }
    if (paramInt == 2)
      a(paramContext, paramBitmap, a.an(paramContext, 2131296839));
    while (true)
    {
      AppMethodBeat.o(129121);
      break;
      if (paramInt == 1)
        a(paramContext, paramBitmap, a.an(paramContext, 2131296840));
    }
  }

  private static void a(Context paramContext, Bitmap paramBitmap, String paramString)
  {
    AppMethodBeat.i(129122);
    if ((paramContext == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
      AppMethodBeat.o(129122);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(paramString))
        break;
      AppMethodBeat.o(129122);
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f1 = a.getDensity(paramContext);
    float f2 = 4.0F * f1;
    float f3 = 2.0F * f1;
    Paint localPaint = new Paint();
    localPaint.setTextSize(f1 * 6.0F);
    localPaint.setFakeBoldText(true);
    localPaint.setAntiAlias(true);
    f1 = localPaint.measureText(paramString);
    Paint.FontMetrics localFontMetrics = localPaint.getFontMetrics();
    float f4 = localFontMetrics.bottom - localFontMetrics.top;
    localPaint.setColor(Color.parseColor("#459AE9"));
    paramBitmap = new Canvas(paramBitmap);
    if (Build.VERSION.SDK_INT < 26);
    for (paramContext = new RectF(i - f1 - 2.0F * f2, j - f4 - 2.0F * f3, i, j); ; paramContext = new RectF(0.0F, j - f4 - 2.0F * f3, f1 + 2.0F * f2, j))
    {
      paramBitmap.drawRoundRect(paramContext, 4.0F, 4.0F, localPaint);
      localPaint.setColor(-1);
      paramBitmap.drawText(paramString, paramContext.left + f2, paramContext.top + f3 - localFontMetrics.ascent, localPaint);
      AppMethodBeat.o(129122);
      break;
    }
  }

  public static boolean a(Context paramContext, a parama, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(129118);
    if (paramContext == null)
    {
      ab.e("MicroMsg.AppBrandShortcutManager", "remove fail, context or config is null.");
      AppMethodBeat.o(129118);
    }
    while (true)
    {
      return bool;
      if (parama.bQQ == null)
      {
        ab.e("MicroMsg.AppBrandShortcutManager", "no such user");
        AppMethodBeat.o(129118);
      }
      else
      {
        Intent localIntent = a(paramContext, parama, paramInt, a(paramContext, k(parama.bQQ), paramInt), false);
        if (localIntent == null)
        {
          ab.e("MicroMsg.AppBrandShortcutManager", "remove fail, intent is null");
          AppMethodBeat.o(129118);
        }
        else
        {
          com.tencent.mm.plugin.base.model.b.s(paramContext, localIntent);
          ab.i("MicroMsg.AppBrandShortcutManager", "remove shortcut %s", new Object[] { parama.userName });
          AppMethodBeat.o(129118);
          bool = true;
        }
      }
    }
  }

  public static boolean a(Context paramContext, a parama, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(129117);
    if ((paramContext == null) || (parama == null))
    {
      ab.e("MicroMsg.AppBrandShortcutManager", "add fail, invalid argument");
      AppMethodBeat.o(129117);
      paramBoolean = false;
    }
    Object localObject;
    Intent localIntent;
    while (true)
    {
      return paramBoolean;
      if (parama.bQQ == null)
      {
        ab.e("MicroMsg.AppBrandShortcutManager", "no such user");
        AppMethodBeat.o(129117);
        paramBoolean = false;
      }
      else
      {
        localObject = k(parama.bQQ);
        if (localObject == null)
        {
          ab.i("MicroMsg.AppBrandShortcutManager", "bitmap do not exist, delay get.");
          AppMethodBeat.o(129117);
          paramBoolean = true;
        }
        else
        {
          localIntent = a(paramContext, parama, paramInt, a(paramContext, (Bitmap)localObject, paramInt), true);
          if (localIntent != null)
            break;
          ab.e("MicroMsg.AppBrandShortcutManager", "add fail, intent is null");
          AppMethodBeat.o(129117);
          paramBoolean = false;
        }
      }
    }
    if ((Intent)localIntent.getParcelableExtra("android.intent.extra.shortcut.INTENT") != null)
    {
      String str = parama.appId;
      localObject = com.tencent.mm.plugin.base.model.b.da(str + String.valueOf(paramInt), q.LK());
      if (localObject != null)
      {
        localObject = com.tencent.mm.plugin.base.model.b.V(((String)localObject).getBytes());
        label194: ab.i("MicroMsg.AppBrandShortcutManager", "alvinluo appId: %s, shortcutId: %s", new Object[] { str, localObject });
      }
    }
    while (true)
    {
      try
      {
        com.tencent.mm.plugin.base.model.b.a(paramContext, localIntent, (String)localObject, paramBoolean);
        ab.i("MicroMsg.AppBrandShortcutManager", "add shortcut %s", new Object[] { parama.userName });
        AppMethodBeat.o(129117);
        paramBoolean = true;
      }
      catch (IllegalStateException paramContext)
      {
        ab.w("MicroMsg.AppBrandShortcutManager", paramContext.toString());
        AppMethodBeat.o(129117);
        paramBoolean = false;
      }
      break;
      localObject = null;
      break label194;
      localObject = null;
    }
  }

  private static Bitmap k(String[] paramArrayOfString)
  {
    AppMethodBeat.i(129120);
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      localObject = paramArrayOfString[j];
      if (!bo.isNullOrNil((String)localObject))
      {
        Bitmap localBitmap = com.tencent.mm.modelappbrand.a.b.abR().a((String)localObject, null);
        if (localBitmap != null)
        {
          localObject = localBitmap;
          if (!localBitmap.isRecycled())
            break label61;
        }
      }
    }
    Object localObject = null;
    label61: AppMethodBeat.o(129120);
    return localObject;
  }

  public static final class a
  {
    public String appId;
    public String[] bQQ;
    public String nickname;
    public int uin;
    public String userName;

    public a(int paramInt, String[] paramArrayOfString, String paramString1, String paramString2, String paramString3)
    {
      this.uin = paramInt;
      this.bQQ = paramArrayOfString;
      this.nickname = paramString1;
      this.appId = paramString2;
      this.userName = paramString3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.u
 * JD-Core Version:    0.6.2
 */
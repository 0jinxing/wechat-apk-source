package com.tencent.mm.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.chatting.ap;

public class SplashWelcomeView extends FrameLayout
  implements ap
{
  private Bitmap bitmap;
  private boolean hasDrawed;
  private volatile boolean yqu;
  private volatile boolean yqv;
  private ImageView yqw;
  private int yqx;

  public SplashWelcomeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(29915);
    hv(paramContext);
    AppMethodBeat.o(29915);
  }

  public SplashWelcomeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(29916);
    hv(paramContext);
    AppMethodBeat.o(29916);
  }

  private void dzd()
  {
    try
    {
      AppMethodBeat.i(29919);
      Object localObject1;
      if (!this.yqu)
      {
        this.yqu = true;
        localObject1 = this.bitmap;
        if (localObject1 == null);
      }
      while (true)
      {
        try
        {
          localObject1 = new com/tencent/mm/ui/SplashWelcomeView$2;
          ((2)localObject1).<init>(this);
          al.d((Runnable)localObject1);
          AppMethodBeat.o(29919);
          return;
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("SplashWelcomeView", localException, "%s", new Object[] { localException.getMessage() });
        }
        AppMethodBeat.o(29919);
      }
    }
    finally
    {
    }
  }

  private void hv(Context paramContext)
  {
    AppMethodBeat.i(29918);
    this.yqw = new SplashImageView(paramContext);
    this.yqw.setScaleType(ImageView.ScaleType.CENTER_CROP);
    ((SplashImageView)this.yqw).setOnDrawListener(this);
    if (ah.bqo())
      paramContext = ah.getContext().getSharedPreferences("switch_account_preferences", 0);
    try
    {
      bool = paramContext.getBoolean("transit_to_switch_account", false);
      ab.i("SplashWelcomeView", "transit to switch account %s", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        paramContext.edit().putBoolean("transit_to_switch_account", false).commit();
        paramContext = com.tencent.mm.vfs.e.e(e.d.yfV, 0, com.tencent.mm.a.e.cs(e.d.yfV));
        if ((paramContext != null) && (paramContext.length > 0))
        {
          paramContext = BitmapFactory.decodeByteArray(paramContext, 0, paramContext.length);
          if (paramContext == null)
            break label187;
          this.yqw.setImageBitmap(paramContext);
        }
      }
      addView(this.yqw, new FrameLayout.LayoutParams(-1, -1));
    }
    catch (Exception paramContext)
    {
      try
      {
        boolean bool;
        if (!ah.bqo())
        {
          ab.i("SplashWelcomeView", "not main process, only load default splash bitmap.");
          AppMethodBeat.o(29918);
        }
        while (true)
        {
          return;
          label187: ab.e("SplashWelcomeView", "get switch account bg null!");
          break;
          paramContext = paramContext;
          ab.printErrStackTrace("SplashWelcomeView", paramContext, "show switch account view with exception!", new Object[0]);
          break;
          Object localObject = ah.getContext().getSharedPreferences("system_config_prefs", 0);
          long l1 = ((SharedPreferences)localObject).getLong("new_launch_image_begin_time", 0L);
          long l2 = ((SharedPreferences)localObject).getLong("new_launch_image_end_time", 0L);
          long l3 = System.currentTimeMillis() / 1000L;
          ab.i("SplashWelcomeView", "beginTime:%s,endTime:%s,currentTime:%s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>();
          paramContext = b.eSj + "splashWelcomeImg";
          if ((l3 <= l1) || (l3 >= l2))
            break label403;
          bool = i((SharedPreferences)localObject);
          if (!bool)
          {
            AppMethodBeat.o(29918);
          }
          else
          {
            localObject = new com/tencent/mm/ui/SplashWelcomeView$1;
            ((1)localObject).<init>(this, paramContext);
            d.post((Runnable)localObject, "readWelcomeBg");
            AppMethodBeat.o(29918);
          }
        }
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          ab.printErrStackTrace("SplashWelcomeView", paramContext, "%s", new Object[] { paramContext.getMessage() });
          AppMethodBeat.o(29918);
          continue;
          label403: ab.i("SplashWelcomeView", "change launch image activity is finished!");
          com.tencent.mm.a.e.deleteFile(paramContext);
          AppMethodBeat.o(29918);
        }
      }
    }
  }

  private boolean i(SharedPreferences paramSharedPreferences)
  {
    boolean bool = false;
    AppMethodBeat.i(29917);
    this.yqx = paramSharedPreferences.getInt("launch_fail_times", 0);
    int i = paramSharedPreferences.getInt("launch_last_status", 0);
    if (i == 1)
    {
      ab.i("SplashWelcomeView", "last launch status is 'start'.");
      this.yqx += 1;
      paramSharedPreferences.edit().putInt("launch_fail_times", this.yqx).commit();
      paramSharedPreferences.edit().putInt("launch_last_status", 1).apply();
      if (this.yqx < 3)
        break label154;
      ab.i("SplashWelcomeView", "launch exceed max failed times, %d", new Object[] { Integer.valueOf(this.yqx) });
      AppMethodBeat.o(29917);
    }
    while (true)
    {
      return bool;
      if (i != 2)
        break;
      ab.i("SplashWelcomeView", "last launch status is 'end'.");
      break;
      label154: AppMethodBeat.o(29917);
      bool = true;
    }
  }

  public final void bCv()
  {
    AppMethodBeat.i(29920);
    ab.i("SplashWelcomeView", "hasDrawed:%s", new Object[] { Boolean.valueOf(this.hasDrawed) });
    if (!this.hasDrawed)
    {
      this.hasDrawed = true;
      if ((this.yqv) && (!this.yqu))
        dzd();
    }
    AppMethodBeat.o(29920);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.SplashWelcomeView
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.ae;

public final class t extends Toast
{
  public final ap che;
  private final Context context;
  public long duration;
  private View hVf;
  public int kmW;
  private int level;
  private final TextView nBV;

  public t(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(106879);
    this.che = new ap(new t.1(this), true);
    this.context = paramContext;
    reset();
    this.hVf = View.inflate(paramContext, 2130970934, null);
    setView(this.hVf);
    setGravity(55, 0, BackwardSupportUtil.b.b(paramContext, 40.0F));
    setDuration(0);
    this.nBV = ((TextView)this.hVf.findViewById(2131828246));
    switch (this.level)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(106879);
      while (true)
      {
        return;
        this.nBV.setTextColor(-1);
        AppMethodBeat.o(106879);
      }
      this.nBV.setTextColor(this.context.getResources().getColor(2131690583));
    }
  }

  public static o a(Activity paramActivity, int paramInt, String paramString)
  {
    AppMethodBeat.i(106884);
    View localView = View.inflate(paramActivity, 2130969937, null);
    Object localObject = (TextView)localView.findViewById(2131825262);
    ((TextView)localObject).setText(paramString);
    ((TextView)localObject).setOnClickListener(null);
    paramString = (ImageView)localView.findViewById(2131825261);
    if (paramInt == 0)
      paramString.setVisibility(8);
    while (true)
    {
      paramString = new o(localView);
      paramString.setWidth(-1);
      paramString.setHeight(-2);
      localObject = new Rect();
      paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject);
      int i = ((Rect)localObject).top;
      int j = de(paramActivity);
      paramInt = i;
      if (i == 0)
        paramInt = ae.hB(paramActivity);
      al.d(new t.7(paramString, paramActivity, paramInt + j));
      al.n(new t.2(paramString), 2000L);
      paramActivity = (ImageButton)localView.findViewById(2131825263);
      paramActivity.setVisibility(8);
      paramActivity.setOnClickListener(new t.3(paramString));
      AppMethodBeat.o(106884);
      return paramString;
      paramString.setImageResource(paramInt);
    }
  }

  public static o a(Activity paramActivity, String paramString, long paramLong)
  {
    AppMethodBeat.i(106882);
    Object localObject = View.inflate(paramActivity, 2130970934, null);
    ((TextView)((View)localObject).findViewById(2131828246)).setText(paramString);
    paramString = new o((View)localObject);
    paramString.setWidth(-1);
    paramString.setHeight(-2);
    localObject = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject);
    int i = ((Rect)localObject).top;
    int j = de(paramActivity);
    paramString.showAtLocation(paramActivity.getWindow().getDecorView(), 48, 0, i + j);
    new t.4(paramString).sendEmptyMessageDelayed(0, paramLong);
    AppMethodBeat.o(106882);
    return paramString;
  }

  public static o a(Activity paramActivity, String paramString, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(106885);
    View localView = View.inflate(paramActivity, 2130970929, null);
    ((LinearLayout)localView.findViewById(2131828238)).setBackgroundColor(paramActivity.getResources().getColor(2131690579));
    Object localObject = (TextView)localView.findViewById(2131828240);
    ((TextView)localObject).setText(paramString);
    ((TextView)localObject).setOnClickListener(null);
    ((TextView)localObject).setTextColor(paramActivity.getResources().getColor(2131689764));
    ((ImageView)localView.findViewById(2131828239)).setImageResource(2131232038);
    paramString = new o(localView);
    paramString.setWidth(-1);
    paramString.setHeight(-2);
    Rect localRect = new Rect();
    localObject = paramActivity.getWindow();
    ((Window)localObject).getDecorView().getWindowVisibleDisplayFrame(localRect);
    int i = localRect.top;
    int j = de(paramActivity);
    int k = i;
    if (i == 0)
      k = ae.hB(paramActivity);
    if (((Window)localObject).getDecorView() != null)
      ((Window)localObject).getDecorView().post(new t.5(paramString, (Window)localObject, k + j));
    paramActivity = (ImageView)localView.findViewById(2131828241);
    paramActivity.setImageResource(2130840462);
    paramActivity.setOnClickListener(new t.6(paramString, paramOnClickListener));
    AppMethodBeat.o(106885);
    return paramString;
  }

  private static int de(Context paramContext)
  {
    AppMethodBeat.i(106883);
    int i;
    if (((paramContext instanceof AppCompatActivity)) && (((AppCompatActivity)paramContext).getSupportActionBar() != null))
    {
      i = ((AppCompatActivity)paramContext).getSupportActionBar().getHeight();
      if (i != 0)
        break label102;
      i = paramContext.getResources().getDimensionPixelSize(2131427563);
      AppMethodBeat.o(106883);
    }
    while (true)
    {
      return i;
      DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
      {
        i = paramContext.getResources().getDimensionPixelSize(2131427562);
        break;
      }
      i = paramContext.getResources().getDimensionPixelSize(2131427563);
      break;
      label102: AppMethodBeat.o(106883);
    }
  }

  public static int hF(Context paramContext)
  {
    AppMethodBeat.i(138364);
    int i = ae.hB(paramContext);
    AppMethodBeat.o(138364);
    return i;
  }

  public static void hO(Context paramContext)
  {
    AppMethodBeat.i(106886);
    if (h.getExternalStorageState().equals("mounted_ro"))
    {
      t.a.az(paramContext, 3);
      AppMethodBeat.o(106886);
    }
    while (true)
    {
      return;
      t.a.az(paramContext, 1);
      AppMethodBeat.o(106886);
    }
  }

  public static void hP(Context paramContext)
  {
    AppMethodBeat.i(106887);
    t.a.az(paramContext, 2);
    AppMethodBeat.o(106887);
  }

  public final void reset()
  {
    this.level = 1;
    this.duration = 2000L;
    this.kmW = ((int)(this.duration / 70L) + 1);
  }

  public final void setText(int paramInt)
  {
    AppMethodBeat.i(106881);
    this.nBV.setText(paramInt);
    AppMethodBeat.o(106881);
  }

  public final void setText(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(106880);
    this.nBV.setText(paramCharSequence);
    AppMethodBeat.o(106880);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.t
 * JD-Core Version:    0.6.2
 */
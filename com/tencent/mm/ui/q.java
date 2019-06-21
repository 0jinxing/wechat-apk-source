package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ak.b;
import com.tencent.mm.g.a.tm;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.base.y;
import com.tencent.mm.ui.statusbar.d;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.ui.widget.a.e.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

public abstract class q
{
  private static PowerManager.WakeLock wakeLock = null;
  private static boolean ylO = false;
  public static final int ylZ = 2130968620;
  public static long ymb;
  private static byte[] ymd = { 0 };
  private int bsz = this.yeY;
  String className;
  public View contentView;
  private o elS;
  private LayoutInflater ezi;
  AudioManager fZh;
  TextView jcI;
  private Button lXZ;
  public ActionBar mActionBar;
  public Context mContext;
  private int mQh = 0;
  protected com.tencent.mm.sdk.platformtools.ak mty = new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper());
  boolean qlP = false;
  private final long ryi = 300L;
  private long ryj = SystemClock.elapsedRealtime();
  private View yeM;
  private int yeO = 0;
  public ImageButton yeP;
  TextView yeR;
  private int yeY;
  private int yeZ;
  LinkedList<a> yfa = new LinkedList();
  private String ylA = " ";
  private int ylB = 0;
  private int ylC = 0;
  private com.tencent.mm.ui.widget.a ylD = null;
  private com.tencent.mm.ui.widget.a ylE = null;
  private com.tencent.mm.ui.widget.a ylF = null;
  private com.tencent.mm.ui.widget.a ylG = null;
  private com.tencent.mm.ui.widget.a ylH = null;
  private boolean ylI = false;
  boolean ylJ = false;
  boolean ylK = false;
  public AppCompatActivity ylL;
  private boolean ylM;
  private a ylN = new a();
  private ArrayList<Dialog> ylP;
  public TextView ylQ;
  public View ylR;
  ImageView ylS;
  int ylT = 0;
  private ImageView ylU;
  private int ylV = 0;
  private boolean ylW = false;
  private c ylX = new c()
  {
  };
  private int ylY = 2130968618;
  protected boolean ylk = false;
  private View ylu;
  public View ylv;
  View ylw;
  private TextView ylx;
  FrameLayout yly;
  public boolean ylz = true;
  private int yma = -1;
  public int ymc = 0;
  private a yme;
  private MenuItem ymf;
  private Runnable ymg = new Runnable()
  {
    public final void run()
    {
      AppMethodBeat.i(105996);
      q.i(q.this).getWindow().setFlags(1024, 1024);
      if (q.j(q.this) != null)
        q.j(q.this).hide();
      AppMethodBeat.o(105996);
    }
  };
  private Runnable ymh = new Runnable()
  {
    public final void run()
    {
      AppMethodBeat.i(105997);
      if (q.j(q.this) != null)
        q.j(q.this).show();
      AppMethodBeat.o(105997);
    }
  };

  private void a(int paramInt1, final boolean paramBoolean1, final String paramString1, final String paramString2, final String paramString3, final int paramInt2, boolean paramBoolean2)
  {
    ab.i("MicroMsg.MMActivityController", "initNotifyView viewid[%d], visible[%b], uithread[%b], noticeid[%s], position[%d], notifyView[%s]", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), paramString3, Integer.valueOf(paramInt2), this.ylw });
    if (!needShowIdcError());
    while (true)
    {
      return;
      if ((!paramBoolean1) && (this.ylw == null))
        break label529;
      if ((this.mActionBar == null) || (this.mActionBar.isShowing()))
        break;
      ab.i("MicroMsg.MMActivityController", "initNotifyView mActionBar not showing");
    }
    if (this.yly == null)
      this.yly = ((FrameLayout)this.contentView.findViewById(2131825953));
    if (this.ylw != null)
      this.yly.removeView(this.ylw);
    if (paramInt1 > 0);
    while (true)
    {
      this.ylw = this.ezi.inflate(paramInt1, null);
      this.ylx = ((TextView)this.ylw.findViewById(2131823312));
      this.ylw.findViewById(2131826105).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(106004);
          paramAnonymousView = new com.tencent.mm.g.a.ak();
          paramAnonymousView.cto.type = 1;
          paramAnonymousView.cto.ctq = paramString3;
          paramAnonymousView.cto.position = paramInt2;
          com.tencent.mm.sdk.b.a.xxA.m(paramAnonymousView);
          q.b(q.this).setVisibility(8);
          AppMethodBeat.o(106004);
        }
      });
      this.ylw.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(106005);
          if (paramString1 != null)
          {
            paramAnonymousView = new Intent("android.intent.action.VIEW");
            paramAnonymousView.setData(Uri.parse(paramString1));
            q.c(q.this).startActivity(paramAnonymousView);
          }
          AppMethodBeat.o(106005);
        }
      });
      paramString3 = new FrameLayout.LayoutParams(-1, -2);
      if ((this.ylW) && (Build.VERSION.SDK_INT >= 16))
      {
        paramString3.setMargins(0, BackwardSupportUtil.b.b(this.ylL, 48.0F), 0, 0);
        ab.i("MicroMsg.MMActivityController", "summerdiz initNotifyView [%d, %d]", new Object[] { Integer.valueOf(paramString3.height), Integer.valueOf(paramString3.topMargin) });
      }
      this.yly.addView(this.ylw, this.yly.getChildCount(), paramString3);
      if (this.ylw == null)
        break;
      if (paramBoolean2)
      {
        paramString3 = this.ylw;
        if (paramBoolean1)
        {
          paramInt1 = 0;
          label341: paramString3.setVisibility(paramInt1);
          String str = this.mContext.getString(2131300604);
          paramString3 = paramString2;
          if (bo.isNullOrNil(paramString2))
            paramString3 = this.mContext.getString(2131298906);
          if (paramString1 == null)
            break label488;
          paramString1 = new SpannableString(paramString3 + str);
          paramString2 = new ForegroundColorSpan(-10119449);
          paramInt2 = paramString3.length();
          paramInt1 = paramString3.length();
          paramString1.setSpan(paramString2, paramInt2, str.length() + paramInt1, 33);
          this.ylx.setText(paramString1);
        }
        while (true)
        {
          this.ylw.invalidate();
          this.yly.invalidate();
          break;
          paramInt1 = 8;
          break label341;
          label488: ab.i("MicroMsg.MMActivityController", "summerdiz url is null 1");
          this.ylx.setText(paramString3);
        }
      }
      this.ylw.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(106006);
          Object localObject = q.b(q.this);
          int i;
          if (paramBoolean1)
          {
            i = 0;
            ((View)localObject).setVisibility(i);
            String str = q.c(q.this).getString(2131300604);
            if (!bo.isNullOrNil(paramString2))
              break label170;
            localObject = q.c(q.this).getString(2131298906);
            label63: if (paramString1 == null)
              break label178;
            SpannableString localSpannableString = new SpannableString((String)localObject + str);
            localSpannableString.setSpan(new ForegroundColorSpan(-10119449), ((String)localObject).length(), ((String)localObject).length() + str.length(), 33);
            q.d(q.this).setText(localSpannableString);
          }
          while (true)
          {
            q.b(q.this).invalidate();
            q.e(q.this).invalidate();
            AppMethodBeat.o(106006);
            return;
            i = 8;
            break;
            label170: localObject = paramString2;
            break label63;
            label178: ab.i("MicroMsg.MMActivityController", "summerdiz url is null 2");
            q.d(q.this).setText((CharSequence)localObject);
          }
        }
      });
      break;
      label529: break;
      paramInt1 = 2130970230;
    }
  }

  private void a(MenuItem paramMenuItem, a parama)
  {
    if (!this.ylz)
      ab.w("MicroMsg.MMActivityController", "callMenuCallback screen not enable.");
    while (true)
    {
      return;
      if (parama.gzB != null)
        parama.gzB.onMenuItemClick(paramMenuItem);
    }
  }

  private static boolean aqE(String paramString)
  {
    boolean bool = false;
    String str1 = Build.MODEL;
    String str2 = Build.DEVICE;
    if ((str1 == null) && (str2 == null));
    while (true)
    {
      return bool;
      if ((il(str1, paramString)) || (il(str2, paramString)))
        bool = true;
    }
  }

  public static Locale bM(Context paramContext, String paramString)
  {
    if (paramString.equals("language_default"))
      aa.a(paramContext, Locale.ENGLISH);
    for (paramContext = Locale.getDefault(); ; paramContext = paramString)
    {
      return paramContext;
      paramString = aa.amw(paramString);
      aa.a(paramContext, paramString);
    }
  }

  public static void dxV()
  {
    ylO = true;
  }

  public static boolean dyk()
  {
    synchronized (ymd)
    {
      if (wakeLock != null)
      {
        bool = wakeLock.isHeld();
        return bool;
      }
      boolean bool = false;
    }
  }

  private static boolean dyp()
  {
    if ((aqE("y83a")) || (aqE("y83")) || (aqE("v1732a")) || (aqE("v1732t")));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static void eY(Context paramContext)
  {
    if (paramContext == null);
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      localInputMethodManager = (InputMethodManager)paramContext.getSystemService("input_method");
    }
    while (localInputMethodManager == null);
    int i = 0;
    while (i < 3)
    {
      Object localObject = new String[] { "mCurRootView", "mServedView", "mNextServedView" }[i];
      try
      {
        Field localField = localInputMethodManager.getClass().getDeclaredField((String)localObject);
        localField.setAccessible(true);
        localObject = localField.get(localInputMethodManager);
        if ((localObject != null) && ((localObject instanceof View)) && (((View)localObject).getContext() == paramContext))
          localField.set(localInputMethodManager, null);
        i++;
      }
      catch (Throwable localThrowable)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.MMActivityController", localThrowable, "", new Object[0]);
      }
    }
  }

  private View findViewById(int paramInt)
  {
    View localView = this.contentView.findViewById(paramInt);
    if (localView != null);
    while (true)
    {
      return localView;
      localView = this.ylL.findViewById(paramInt);
    }
  }

  private com.tencent.mm.ui.widget.a hb(int paramInt1, int paramInt2)
  {
    Drawable localDrawable = this.mContext.getResources().getDrawable(paramInt2);
    if (this.qlP)
      localDrawable = ah.f(this.ylL, paramInt2, -1);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    com.tencent.mm.ui.widget.a locala = new com.tencent.mm.ui.widget.a(localDrawable);
    locala.zLT = ((localDrawable.getIntrinsicHeight() - paramInt1) / 2);
    return locala;
  }

  private void hp(Context paramContext)
  {
    synchronized (ymd)
    {
      if (wakeLock == null)
        wakeLock = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(32, "screen Lock");
      if (!wakeLock.isHeld())
      {
        wakeLock.acquire();
        ab.i("MicroMsg.MMActivityController", "after acquire screen off wakelock from object: %s, isHeld: %s", new Object[] { toString(), Boolean.valueOf(wakeLock.isHeld()) });
        return;
      }
      ab.w("MicroMsg.MMActivityController", "repeatedly acquire screen off wakelock from object: %s, drop this call.", new Object[] { toString() });
    }
  }

  private static boolean il(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null));
    for (boolean bool = false; ; bool = bo.isEqual(paramString1.toLowerCase(), paramString2.toLowerCase()))
      return bool;
  }

  public static Locale initLanguage(Context paramContext)
  {
    return bM(paramContext, aa.g(paramContext.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0)));
  }

  private void releaseWakeLock()
  {
    synchronized (ymd)
    {
      if ((wakeLock != null) && (wakeLock.isHeld()))
      {
        wakeLock.release();
        ab.i("MicroMsg.MMActivityController", "after release screen off wakelock from object: %s, isHeld: %s", new Object[] { toString(), Boolean.valueOf(wakeLock.isHeld()) });
        wakeLock = null;
        return;
      }
      ab.w("MicroMsg.MMActivityController", "repeatedly release screen off wakelock from object: %s, drop this call.", new Object[] { toString() });
    }
  }

  public static void showVKB(Activity paramActivity)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)paramActivity.getSystemService("input_method");
    if (localInputMethodManager == null);
    while (true)
    {
      return;
      paramActivity = paramActivity.getCurrentFocus();
      if ((paramActivity != null) && (paramActivity.getWindowToken() != null))
        localInputMethodManager.toggleSoftInput(0, 2);
    }
  }

  public final void M(CharSequence paramCharSequence)
  {
    if (this.mActionBar == null);
    while (true)
    {
      return;
      this.ylA = paramCharSequence.toString();
      this.ylQ.setText(paramCharSequence);
      if (com.tencent.mm.bz.a.ga(this.ylL))
        this.ylQ.setTextSize(0, com.tencent.mm.bz.a.am(this.ylL, 2131427496) * com.tencent.mm.bz.a.fY(this.ylL));
      updateDescription(paramCharSequence.toString());
    }
  }

  public final void Nb(int paramInt)
  {
    View localView;
    if ((Build.VERSION.SDK_INT >= 26) && (!dyp()))
    {
      this.ylL.getWindow().setNavigationBarColor(paramInt);
      boolean bool = ah.Nw(paramInt);
      localView = this.ylL.getWindow().getDecorView();
      paramInt = localView.getSystemUiVisibility();
      if (!bool)
        break label61;
      paramInt &= -17;
    }
    while (true)
    {
      localView.setSystemUiVisibility(paramInt);
      return;
      label61: paramInt |= 16;
    }
  }

  final boolean Nf(int paramInt)
  {
    boolean bool1 = false;
    for (int i = 0; ; i++)
    {
      boolean bool2 = bool1;
      if (i < this.yfa.size())
      {
        if (((a)this.yfa.get(i)).yfi == paramInt)
        {
          ab.d("MicroMsg.MMActivityController", "match menu, id %d, remove it", new Object[] { Integer.valueOf(paramInt) });
          this.yfa.remove(i);
          bool2 = true;
        }
      }
      else
        return bool2;
    }
  }

  public final a Ng(int paramInt)
  {
    Iterator localIterator = this.yfa.iterator();
    a locala;
    do
    {
      if (!localIterator.hasNext())
        break;
      locala = (a)localIterator.next();
    }
    while (locala.yfi != paramInt);
    while (true)
    {
      return locala;
      locala = null;
    }
  }

  final void a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener, b paramb)
  {
    a locala = new a();
    locala.yfi = paramInt1;
    locala.yfj = paramInt2;
    locala.text = paramString;
    locala.gzB = paramOnMenuItemClickListener;
    locala.mlV = paramOnLongClickListener;
    locala.ymr = paramb;
    locala.yms = paramBoolean;
    if ((locala.yfj == 2130839555) && (bo.isNullOrNil(paramString)))
      locala.text = this.mContext.getString(2131296975);
    Nf(locala.yfi);
    this.yfa.add(locala);
    supportInvalidateOptionsMenu();
  }

  public final void a(Context paramContext, AppCompatActivity paramAppCompatActivity)
  {
    this.mContext = paramAppCompatActivity;
    this.ylL = paramAppCompatActivity;
    Object localObject;
    if (Build.VERSION.SDK_INT >= 28)
    {
      localObject = this.ylL.getWindow().getAttributes();
      ((WindowManager.LayoutParams)localObject).layoutInDisplayCutoutMode = 1;
      this.ylL.getWindow().setAttributes((WindowManager.LayoutParams)localObject);
    }
    boolean bool = com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_redesign", 4).getBoolean("dark_actionbar_init_new", false);
    com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_redesign", 4).getBoolean("dark_actionbar", false);
    if (!bool)
    {
      com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_redesign", 4).edit().putBoolean("dark_actionbar", false).commit();
      com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_redesign", 4).edit().putBoolean("dark_actionbar_init_new", true).commit();
    }
    onCreateBeforeSetContentView();
    this.className = getClass().getName();
    ac.bL(3, this.className);
    initLanguage(paramContext);
    this.fZh = ((AudioManager)this.mContext.getSystemService("audio"));
    int i = getLayoutId();
    this.ezi = LayoutInflater.from(this.mContext);
    this.contentView = com.tencent.mm.kiss.a.b.SM().a(paramAppCompatActivity, "R.layout.mm_activity", 2130970087);
    this.ylu = this.contentView.findViewById(2131825954);
    this.yly = ((FrameLayout)this.contentView.findViewById(2131825953));
    this.mQh = this.mContext.getResources().getDimensionPixelSize(2131427852);
    label526: long l;
    if (i != -1)
    {
      this.ylv = getLayoutView();
      if (this.ylv == null)
      {
        this.ylv = this.ezi.inflate(getLayoutId(), null);
        this.yly.addView(this.ylv, 0);
      }
    }
    else
    {
      dealContentView(this.contentView);
      if (dxT())
      {
        ae.h(ae.a(this.ylL.getWindow(), this.ylv), this.ylv);
        ((ViewGroup)this.ylv.getParent()).removeView(this.ylv);
        ((ViewGroup)this.ylL.getWindow().getDecorView()).addView(this.ylv, 0);
        int j = com.tencent.mm.bz.a.fromDPToPix(this.mContext, 25);
        paramContext = this.mContext.getResources().getDisplayMetrics();
        if (paramContext.widthPixels <= paramContext.heightPixels)
          break label907;
        i = this.mContext.getResources().getDimensionPixelSize(2131427562);
        this.ylv.setPadding(this.ylv.getPaddingLeft(), i + (j + this.ylv.getPaddingTop()), this.ylv.getPaddingRight(), this.ylv.getPaddingBottom());
      }
      this.mActionBar = getSupportActionBar();
      ab.d("MicroMsg.MMActivityController", "onCreate, before.");
      ap(paramAppCompatActivity);
      this.yeY = aj.am(this.mContext, 2131427563);
      this.yeZ = aj.am(this.mContext, 2131427849);
      if ((this.yly == null) || (!(this.yly instanceof LayoutListenerView)))
        break label925;
      ((LayoutListenerView)this.yly).setOnResizedListener(new LayoutListenerView.c()
      {
        private final int ymn;

        public final void onSizeChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
        {
          AppMethodBeat.i(106008);
          if (q.f(q.this))
            AppMethodBeat.o(106008);
          while (true)
          {
            return;
            if ((paramAnonymousInt1 != 0) && (paramAnonymousInt2 != 0) && (paramAnonymousInt3 != 0) && (paramAnonymousInt4 != 0) && (paramAnonymousInt1 == paramAnonymousInt3))
            {
              if ((paramAnonymousInt2 > paramAnonymousInt4) && (paramAnonymousInt2 - paramAnonymousInt4 > this.ymn))
              {
                q.g(q.this);
                AppMethodBeat.o(106008);
              }
              else if ((paramAnonymousInt4 > paramAnonymousInt2) && (paramAnonymousInt4 - paramAnonymousInt2 > this.ymn))
              {
                q.h(q.this);
              }
            }
            else
              AppMethodBeat.o(106008);
          }
        }
      });
      label651: paramContext = new com.tencent.mm.g.a.ak();
      paramContext.cto.type = 2;
      paramContext.cto.position = this.ylV;
      com.tencent.mm.sdk.b.a.xxA.m(paramContext);
      if (paramContext.ctp.cts == 2)
      {
        l = System.currentTimeMillis();
        localObject = paramContext.ctp.ctu;
        i = paramContext.ctp.position;
        ab.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onCreate position[%d], noticeId[%s] stack[%s]", new Object[] { Integer.valueOf(i), localObject, bo.dpG() });
        if ((i <= 0) || (i == this.ylV))
          break label936;
        ab.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onCreate position not match[%d, %d] ignore display", new Object[] { Integer.valueOf(i), Integer.valueOf(this.ylV) });
      }
    }
    while (true)
    {
      ab.v("MicroMsg.INIT", "KEVIN MMActivity onCreate initNotifyView:" + (System.currentTimeMillis() - l));
      if (Build.VERSION.SDK_INT >= 21)
      {
        if (this.yeO == 0)
          this.yeO = dyj();
        paramContext = paramAppCompatActivity.getWindow();
        paramContext.clearFlags(201326592);
        paramContext.addFlags(-2147483648);
        l(paramAppCompatActivity, this.yeO);
        dyo();
      }
      return;
      if (this.ylv.getParent() == null)
        break;
      ((ViewGroup)this.ylv.getParent()).removeView(this.ylv);
      break;
      label907: i = this.mContext.getResources().getDimensionPixelSize(2131427563);
      break label526;
      label925: ab.w("MicroMsg.MMActivityController", "layoutListenerView is not right");
      break label651;
      label936: a(paramContext.ctp.ctt, paramContext.ctp.aIB, paramContext.ctp.url, paramContext.ctp.desc, (String)localObject, i, true);
    }
  }

  public final void a(a parama)
  {
    Nf(parama.yfi);
    this.yfa.add(parama);
    supportInvalidateOptionsMenu();
  }

  public final void aC(int paramInt, boolean paramBoolean)
  {
    this.ylV = paramInt;
    this.ylW = paramBoolean;
  }

  public final void activateBroadcast(boolean paramBoolean)
  {
    if ((!ylO) && (paramBoolean))
      y.d(paramBoolean, new Intent().putExtra("classname", getClassName()).putExtra("main_process", false));
    while (true)
    {
      return;
      y.d(paramBoolean, new Intent().putExtra("classname", getClassName() + bJj()));
    }
  }

  public final void addDialog(Dialog paramDialog)
  {
    if (paramDialog == null);
    while (true)
    {
      return;
      if (this.ylP == null)
        this.ylP = new ArrayList();
      this.ylP.add(paramDialog);
    }
  }

  public final void addIconOptionMenu(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt1, paramInt3, this.mContext.getString(paramInt2), false, paramOnMenuItemClickListener, null, b.ymt);
  }

  public final void addIconOptionMenu(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    a(paramInt1, paramInt3, this.mContext.getString(paramInt2), false, paramOnMenuItemClickListener, paramOnLongClickListener, b.ymt);
  }

  public final void addIconOptionMenu(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt1, paramInt3, this.mContext.getString(paramInt2), paramBoolean, paramOnMenuItemClickListener, null, b.ymt);
  }

  public final void addIconOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt1, paramInt2, "", false, paramOnMenuItemClickListener, null, b.ymt);
  }

  public final void addIconOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    a(paramInt1, paramInt2, "", false, paramOnMenuItemClickListener, paramOnLongClickListener, b.ymt);
  }

  public final void addIconOptionMenu(int paramInt1, String paramString, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt1, paramInt2, paramString, false, paramOnMenuItemClickListener, null, b.ymt);
  }

  public final void addSearchMenu(boolean paramBoolean, o paramo)
  {
    ab.v("MicroMsg.MMActivityController", "add search menu");
    a locala = new a();
    locala.yfi = 2131820645;
    locala.text = this.mContext.getString(2131297040);
    locala.yfj = 2131230741;
    locala.gzB = null;
    locala.mlV = null;
    removeOptionMenu(locala.yfi);
    this.yfa.add(0, locala);
    this.ylM = paramBoolean;
    this.elS = paramo;
    supportInvalidateOptionsMenu();
  }

  public final void addTextOptionMenu(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt, 0, paramString, false, paramOnMenuItemClickListener, null, b.ymt);
  }

  public final void addTextOptionMenu(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener, b paramb)
  {
    a(paramInt, 0, paramString, false, paramOnMenuItemClickListener, paramOnLongClickListener, paramb);
  }

  public final void ap(Activity paramActivity)
  {
    if ((this.mActionBar != null) && (!noActionBar()))
    {
      ab.d("MicroMsg.MMActivityController", "onCreate, after");
      if (this.yeO == 0)
        this.yeO = dyj();
      this.qlP = ah.Nw(this.yeO);
      xE(this.yeO);
      this.mActionBar.setLogo(new ColorDrawable(this.ylL.getResources().getColor(17170445)));
      this.mActionBar.fc();
      this.mActionBar.setDisplayHomeAsUpEnabled(false);
      this.mActionBar.fb();
      this.mActionBar.fd();
      this.mActionBar.fa();
      if (this.yma != -1)
        break label328;
      this.mActionBar.setCustomView(v.hu(this.ylL).inflate(this.ylY, new LinearLayout(this.ylL), false));
      this.ylQ = ((TextView)findViewById(16908308));
      this.jcI = ((TextView)findViewById(16908309));
      this.yeM = findViewById(2131820982);
      this.ylR = findViewById(2131820973);
      this.ylS = ((ImageView)findViewById(2131820974));
      this.ylR.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          AppMethodBeat.i(106009);
          if ((paramAnonymousMotionEvent.getAction() == 3) || (paramAnonymousMotionEvent.getAction() == 1))
            q.ymb = System.currentTimeMillis();
          AppMethodBeat.o(106009);
          return false;
        }
      });
      if (this.ylS != null)
        this.ylS.setContentDescription(this.ylL.getString(2131296530));
      if (this.ylQ != null)
        this.ylQ.setText(2131296982);
      if (paramActivity.getClass().getName() != "WebViewUI")
        break label364;
      if (this.ylS != null)
        this.ylS.setVisibility(0);
      if (this.ylR != null)
        this.ylR.setVisibility(0);
    }
    while (true)
    {
      dyn();
      return;
      label328: this.mActionBar.setCustomView(v.hu(this.ylL).inflate(this.yma, new LinearLayout(this.ylL), false));
      break;
      label364: if ((paramActivity instanceof MMActivity))
      {
        if (this.ylS != null)
          this.ylS.setVisibility(0);
        if (this.ylR != null)
          this.ylR.setVisibility(0);
        if (this.ylQ != null)
          this.ylQ.setVisibility(0);
      }
      else
      {
        if (this.ylS != null)
          this.ylS.setVisibility(8);
        if (this.ylR != null)
          this.ylR.setVisibility(8);
      }
    }
  }

  protected abstract String bJj();

  public final void bn(float paramFloat)
  {
    if (this.mActionBar == null);
    while (true)
    {
      return;
      if (this.ylQ != null)
        this.ylQ.setTextSize(0, paramFloat);
    }
  }

  public final boolean callBackMenu()
  {
    if ((this.ylN != null) && (this.ylN.enable))
      a(null, this.ylN);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void d(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    Iterator localIterator;
    boolean bool;
    a locala;
    if (paramBoolean1)
    {
      localIterator = this.yfa.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (!localIterator.hasNext())
        break label125;
      locala = (a)localIterator.next();
      if (locala.enable == paramBoolean2)
        break label191;
      locala.enable = paramBoolean2;
      paramBoolean1 = true;
    }
    label188: label191: 
    while (true)
    {
      break;
      localIterator = this.yfa.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        if ((locala.yfi != paramInt) || (locala.enable == paramBoolean2))
          break label188;
        locala.enable = paramBoolean2;
        paramBoolean1 = true;
      }
      while (true)
      {
        break;
        label125: if (this.elS == null);
        for (paramBoolean1 = false; ; paramBoolean1 = this.elS.zGV)
        {
          if (!paramBoolean1)
            supportInvalidateOptionsMenu();
          ab.v("MicroMsg.MMActivityController", "enable option menu, target id %d, changed %B, searching %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool), Boolean.valueOf(paramBoolean1) });
          return;
        }
      }
    }
  }

  protected abstract void dealContentView(View paramView);

  protected abstract boolean dxT();

  public final int dyj()
  {
    this.qlP = false;
    if (this.yeO == 0)
      this.yeO = this.mContext.getResources().getColor(2131690310);
    return this.yeO;
  }

  public final void dyl()
  {
    if (this.mActionBar != null)
      this.mActionBar.hide();
    this.mty.removeCallbacks(this.ymh);
    this.mty.removeCallbacks(this.ymg);
    this.mty.postDelayed(this.ymg, 0L);
  }

  final void dym()
  {
    Object localObject1 = "%s";
    int i = this.mContext.getResources().getDimensionPixelSize(2131427496);
    if (this.ylB != 0)
      localObject1 = "# ".concat(String.valueOf("%s"));
    if (this.ylC != 0)
      localObject1 = (String)localObject1 + " #";
    for (int j = 1; ; j = 0)
    {
      if ((!this.ylJ) && (this.ylI))
      {
        localObject1 = (String)localObject1 + " #";
        j += 2;
      }
      for (int k = 1; ; k = 0)
      {
        if (this.ylJ)
        {
          localObject1 = (String)localObject1 + " #";
          j += 2;
        }
        for (int m = 1; ; m = 0)
        {
          int n;
          int i1;
          if (this.ylK)
          {
            localObject1 = (String)localObject1 + " #";
            n = k + 2;
            k = 1;
            i1 = j + 2;
            j = n;
          }
          while (true)
          {
            Object localObject2 = String.format((String)localObject1, new Object[] { this.ylA });
            ab.v("MicroMsg.MMActivityController", "span title format %s", new Object[] { localObject1 });
            localObject1 = com.tencent.mm.ui.e.c.b.h(this.mContext, (CharSequence)localObject2, i);
            if ((localObject1 instanceof SpannableString))
            {
              localObject2 = (SpannableString)localObject1;
              if (this.ylB != 0)
                ((SpannableString)localObject2).setSpan(this.ylD, 0, 1, 33);
              if (this.ylC != 0)
              {
                i1 = ((SpannableString)localObject2).length() - i1;
                ((SpannableString)localObject2).setSpan(this.ylE, i1, i1 + 1, 33);
              }
              if (this.ylJ)
              {
                if (this.ylG == null)
                  this.ylG = hb(i, 2131231066);
                m = ((SpannableString)localObject2).length() - m;
                ((SpannableString)localObject2).setSpan(this.ylG, m, m + 1, 33);
              }
              if ((!this.ylJ) && (this.ylI))
              {
                if (this.ylF == null)
                  this.ylF = hb(i, 2131231068);
                j = ((SpannableString)localObject2).length() - j;
                ((SpannableString)localObject2).setSpan(this.ylF, j, j + 1, 33);
              }
              if (this.ylK)
              {
                if (this.ylH == null)
                  this.ylH = hb(i, 2131231069);
                k = ((SpannableString)localObject2).length() - k;
                ((SpannableString)localObject2).setSpan(this.ylH, k, k + 1, 33);
              }
            }
            this.ylQ.setText((CharSequence)localObject1);
            return;
            n = 0;
            i1 = j;
            j = k;
            k = n;
          }
        }
      }
    }
  }

  final void dyn()
  {
    if (this.qlP)
    {
      if (this.ylS != null)
      {
        this.ylS.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        this.ylR.setBackgroundResource(2130840105);
      }
      if ((this.ylQ != null) && (this.ylQ.getVisibility() == 0))
        this.ylQ.setTextColor(this.mContext.getResources().getColor(2131690693));
      if ((this.jcI != null) && (this.jcI.getVisibility() == 0))
        this.jcI.setTextColor(this.mContext.getResources().getColor(2131690693));
      if ((this.yeP != null) && (this.yeP.getVisibility() == 0))
        if (this.yeP.getDrawable() != null)
          this.yeP.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
    }
    while (true)
    {
      return;
      this.yeP.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
      continue;
      if ((this.yeR != null) && (this.yeR.getVisibility() == 0))
      {
        this.yeR.setTextColor(com.tencent.mm.bz.a.h(this.mContext, 2131690780));
        continue;
        if (this.ylS != null)
        {
          this.ylS.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
          this.ylR.setBackgroundResource(2130837630);
        }
        if ((this.ylQ != null) && (this.ylQ.getVisibility() == 0))
          this.ylQ.setTextColor(this.mContext.getResources().getColor(2131689764));
        if ((this.jcI != null) && (this.jcI.getVisibility() == 0))
          this.jcI.setTextColor(this.mContext.getResources().getColor(2131689764));
        if ((this.yeP != null) && (this.yeP.getVisibility() == 0))
        {
          if (this.yeP.getDrawable() != null)
            this.yeP.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
          else
            this.yeP.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        }
        else if ((this.yeR != null) && (this.yeR.getVisibility() == 0))
          this.yeR.setTextColor(com.tencent.mm.bz.a.h(this.mContext, 2131690723));
      }
    }
  }

  final void dyo()
  {
    View localView;
    int i;
    if (Build.VERSION.SDK_INT >= 23)
    {
      localView = this.ylL.getWindow().getDecorView();
      i = localView.getSystemUiVisibility();
      ab.d("MicroMsg.MMActivityController", "dancy test actionbar isDark:%s", new Object[] { Boolean.valueOf(this.qlP) });
      if (!this.qlP)
        break label65;
      i &= -8193;
    }
    while (true)
    {
      localView.setSystemUiVisibility(i);
      return;
      label65: i |= 8192;
    }
  }

  final void e(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    Object localObject1;
    boolean bool;
    Object localObject2;
    if (paramBoolean1)
    {
      localObject1 = this.yfa.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (!((Iterator)localObject1).hasNext())
        break label125;
      localObject2 = (a)((Iterator)localObject1).next();
      if (((a)localObject2).aIB == paramBoolean2)
        break label196;
      ((a)localObject2).aIB = paramBoolean2;
      paramBoolean1 = true;
    }
    label193: label196: 
    while (true)
    {
      break;
      localObject2 = this.yfa.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (((Iterator)localObject2).hasNext())
      {
        localObject1 = (a)((Iterator)localObject2).next();
        if ((((a)localObject1).yfi != paramInt) || (((a)localObject1).aIB == paramBoolean2))
          break label193;
        ((a)localObject1).aIB = paramBoolean2;
        paramBoolean1 = true;
      }
      while (true)
      {
        break;
        label125: if (this.elS == null);
        for (paramBoolean1 = false; ; paramBoolean1 = this.elS.zGV)
        {
          if ((bool) && (!paramBoolean1))
            supportInvalidateOptionsMenu();
          ab.i("MicroMsg.MMActivityController", "show option menu, target id %d, changed %B, searching %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool), Boolean.valueOf(paramBoolean1) });
          return;
        }
      }
    }
  }

  public final void enableBackMenu(boolean paramBoolean)
  {
    if (this.ylN == null);
    while (true)
    {
      return;
      if (this.ylN.enable != paramBoolean)
      {
        this.ylN.enable = paramBoolean;
        supportInvalidateOptionsMenu();
      }
    }
  }

  public final void fullScreenNoTitleBar(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.mActionBar != null)
        this.mActionBar.hide();
      this.mty.removeCallbacks(this.ymh);
      this.mty.removeCallbacks(this.ymg);
      this.mty.postDelayed(this.ymg, 256L);
    }
    while (true)
    {
      return;
      this.ylL.getWindow().clearFlags(1024);
      this.mty.removeCallbacks(this.ymg);
      this.mty.removeCallbacks(this.ymh);
      this.mty.postDelayed(this.ymh, 256L);
    }
  }

  protected abstract String getClassName();

  public final boolean getLandscapeMode()
  {
    return this.ylk;
  }

  protected abstract int getLayoutId();

  protected abstract View getLayoutView();

  public final CharSequence getMMTitle()
  {
    Object localObject;
    if (this.mActionBar == null)
      localObject = null;
    while (true)
    {
      return localObject;
      if (this.ylA != null)
        localObject = this.ylA;
      else
        localObject = this.mActionBar.getTitle();
    }
  }

  public ActionBar getSupportActionBar()
  {
    return this.ylL.getSupportActionBar();
  }

  public final int getTitleLocation()
  {
    if (this.mActionBar == null);
    for (int i = 0; ; i = this.mActionBar.getHeight())
      return i;
  }

  public final void hideTitleView()
  {
    boolean bool = true;
    if (this.mActionBar != null)
    {
      ab.v("MicroMsg.MMActivityController", "hideTitleView hasTitle:%b", new Object[] { Boolean.valueOf(bool) });
      if (this.mActionBar != null)
        break label41;
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label41: this.mActionBar.hide();
    }
  }

  public final boolean hideVKB()
  {
    boolean bool1 = false;
    InputMethodManager localInputMethodManager = (InputMethodManager)this.mContext.getSystemService("input_method");
    boolean bool2;
    if (localInputMethodManager == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      Object localObject = this.ylL.getCurrentFocus();
      bool2 = bool1;
      if (localObject == null)
        continue;
      localObject = ((View)localObject).getWindowToken();
      bool2 = bool1;
      if (localObject == null)
        continue;
      try
      {
        bool2 = localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
        ab.v("MicroMsg.MMActivityController", "hide VKB result %B", new Object[] { Boolean.valueOf(bool2) });
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        while (true)
        {
          ab.e("MicroMsg.MMActivityController", "hide VKB exception %s", new Object[] { localIllegalArgumentException });
          bool2 = false;
        }
      }
    }
  }

  public final boolean hideVKB(View paramView)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramView == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      InputMethodManager localInputMethodManager = (InputMethodManager)this.mContext.getSystemService("input_method");
      bool2 = bool1;
      if (localInputMethodManager == null)
        continue;
      paramView = paramView.getWindowToken();
      bool2 = bool1;
      if (paramView == null)
        continue;
      try
      {
        bool2 = localInputMethodManager.hideSoftInputFromWindow(paramView, 0);
      }
      catch (IllegalArgumentException paramView)
      {
        while (true)
        {
          ab.e("MicroMsg.MMActivityController", "hide VKB(View) exception %s", new Object[] { paramView });
          bool2 = false;
        }
      }
    }
  }

  public final void hq(Context paramContext)
  {
    com.tencent.mm.sdk.b.a.xxA.d(this.ylX);
    if (this.ylP != null)
    {
      int i = this.ylP.size();
      for (int j = 0; j < i; j++)
      {
        Dialog localDialog = (Dialog)this.ylP.get(j);
        if ((localDialog != null) && (localDialog.isShowing()))
          localDialog.dismiss();
      }
      this.ylP.clear();
      this.ylP = null;
    }
    eY(paramContext);
  }

  public boolean interceptSupportInvalidateOptionsMenu()
  {
    return false;
  }

  public final boolean isTitleShowing()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (this.mActionBar != null)
    {
      ab.v("MicroMsg.MMActivityController", "isTitleShowing hasTitle:%b", new Object[] { Boolean.valueOf(bool1) });
      if (this.mActionBar != null)
        break label46;
    }
    label46: for (bool1 = bool2; ; bool1 = this.mActionBar.isShowing())
    {
      return bool1;
      bool1 = false;
      break;
    }
  }

  @TargetApi(21)
  public final void l(Activity paramActivity, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21)
      return;
    if ((Build.VERSION.SDK_INT >= 23) && (!com.tencent.mm.compatible.util.h.Mt()));
    while (true)
    {
      label23: if (((paramActivity instanceof MMActivity)) && (((MMActivity)paramActivity).yll) && (((MMActivity)paramActivity).isSupportNavigationSwipeBack()))
        com.tencent.mm.ui.statusbar.a.d(this.contentView, paramInt, d.b(paramActivity.getWindow()));
      while (true)
      {
        Nb(this.ylL.getResources().getColor(2131689498));
        break;
        if (Build.VERSION.SDK_INT < 21)
          break label122;
        paramInt = ah.s(paramActivity.getResources().getColor(2131690515), paramInt);
        break label23;
        paramActivity.getWindow().setStatusBarColor(paramInt);
      }
      label122: paramInt = 0;
    }
  }

  public boolean needShowIdcError()
  {
    return true;
  }

  public boolean noActionBar()
  {
    return false;
  }

  protected abstract void onCreateBeforeSetContentView();

  public final boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool1 = true;
    ab.d("MicroMsg.MMActivityController", "on create option menu, menuCache size:%d", new Object[] { Integer.valueOf(this.yfa.size()) });
    boolean bool2;
    if ((this.mActionBar == null) || (this.yfa.size() == 0))
    {
      ab.w("MicroMsg.MMActivityController", "error, mActionBar is null or cache size:%d", new Object[] { Integer.valueOf(this.yfa.size()) });
      bool2 = false;
      return bool2;
    }
    this.yme = null;
    this.ymf = null;
    if (this.mActionBar.getHeight() == 0)
    {
      localObject = this.mContext.getResources().getDisplayMetrics();
      if (((DisplayMetrics)localObject).widthPixels <= ((DisplayMetrics)localObject).heightPixels)
        break label187;
      this.mContext.getResources().getDimensionPixelSize(2131427562);
    }
    final a locala;
    while (true)
    {
      Iterator localIterator = this.yfa.iterator();
      while (true)
      {
        bool2 = bool1;
        if (!localIterator.hasNext())
          break;
        locala = (a)localIterator.next();
        if (locala.yfi != 16908332)
          break label204;
        ab.v("MicroMsg.MMActivityController", "match back option menu, continue");
      }
      label187: this.mContext.getResources().getDimensionPixelSize(2131427563);
    }
    label204: if (locala.yfi == 2131820645)
    {
      boolean bool3 = this.ylM;
      if (this.elS == null);
      for (bool2 = true; ; bool2 = false)
      {
        ab.v("MicroMsg.MMActivityController", "match search menu, enable search view[%B], search view helper is null[%B]", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool2) });
        if ((!this.ylM) || (this.elS == null))
          break;
        this.elS.a(this.ylL, paramMenu);
        break;
      }
    }
    final MenuItem localMenuItem = paramMenu.add(0, locala.yfi, 0, locala.text);
    com.tencent.mm.compatible.i.a.a(localMenuItem, getClass().getName());
    View.OnClickListener local15 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(106011);
        q.a(q.this, localMenuItem, locala);
        AppMethodBeat.o(106011);
      }
    };
    Object localObject = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        AppMethodBeat.i(106012);
        boolean bool = q.a(q.this, paramAnonymousView, locala);
        AppMethodBeat.o(106012);
        return bool;
      }
    };
    if ((locala.yfj != 0) || (locala.ymq != null))
    {
      if (locala.yfl == null)
        locala.yfl = View.inflate(this.mContext, 2130968611, null);
      ImageView localImageView = (ImageView)locala.yfl.findViewById(2131821128);
      if (localImageView != null)
        localImageView.setVisibility(8);
      this.yeP = ((ImageButton)locala.yfl.findViewById(2131820960));
      this.yeP.setVisibility(0);
      if (locala.ymq != null)
      {
        this.yeP.setImageDrawable(locala.ymq);
        label463: if (this.ylT == 0)
          break label715;
        this.yeP.getDrawable().setColorFilter(this.ylT, PorterDuff.Mode.SRC_ATOP);
        label487: this.yeP.setOnClickListener(local15);
        this.yeP.setEnabled(locala.enable);
        this.yeP.setContentDescription(locala.text);
        if (locala.mlV != null)
          this.yeP.setOnLongClickListener((View.OnLongClickListener)localObject);
        this.ylU = ((ImageView)locala.yfl.findViewById(2131820961));
        if (this.ylU != null)
        {
          if (!locala.yms)
            break label766;
          this.ylU.setVisibility(0);
        }
      }
      while (true)
      {
        android.support.v4.view.g.a(localMenuItem, locala.yfl);
        localMenuItem.setEnabled(locala.enable);
        localMenuItem.setVisible(locala.aIB);
        android.support.v4.view.g.a(localMenuItem, 2);
        if (locala.yfj == 2130839555)
        {
          this.yme = locala;
          this.ymf = localMenuItem;
        }
        ab.v("MicroMsg.MMActivityController", "set %d %s option menu enable %B, visible %B", new Object[] { Integer.valueOf(locala.yfi), locala.text, Boolean.valueOf(locala.enable), Boolean.valueOf(locala.aIB) });
        break;
        this.yeP.setImageResource(locala.yfj);
        break label463;
        label715: if (locala.ymp != 0)
          break label487;
        if (this.qlP)
        {
          this.yeP.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
          break label487;
        }
        this.yeP.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        break label487;
        label766: this.ylU.setVisibility(8);
      }
    }
    if (locala.yfk == null)
      locala.yfk = View.inflate(this.mContext, 2130968611, null);
    this.yeR = ((TextView)locala.yfk.findViewById(2131820958));
    this.yeR.setVisibility(0);
    this.lXZ = ((Button)locala.yfk.findViewById(2131820959));
    this.lXZ.setVisibility(8);
    if ((locala.ymr == b.ymv) || (locala.ymr == b.ymy))
    {
      this.yeR.setTextColor(com.tencent.mm.bz.a.h(this.ylL, 2131690766));
      this.lXZ.setVisibility(0);
      this.lXZ.setBackgroundResource(2130838004);
      this.yeR.setVisibility(8);
    }
    while (true)
    {
      this.yeR.setText(locala.text);
      if (locala.textColor != 0)
        this.yeR.setTextColor(locala.textColor);
      this.yeR.setOnClickListener(local15);
      this.yeR.setOnLongClickListener((View.OnLongClickListener)localObject);
      this.yeR.setEnabled(locala.enable);
      this.lXZ.setText(locala.text);
      this.lXZ.setOnClickListener(local15);
      this.lXZ.setOnLongClickListener((View.OnLongClickListener)localObject);
      this.lXZ.setEnabled(locala.enable);
      android.support.v4.view.g.a(localMenuItem, locala.yfk);
      break;
      if ((locala.ymr == b.ymu) || (locala.ymr == b.ymz))
      {
        this.lXZ.setVisibility(0);
        this.lXZ.setBackgroundResource(2130838001);
        this.yeR.setVisibility(8);
      }
      else if (locala.ymr != b.ymw)
      {
        if (locala.ymr == b.ymB)
        {
          this.yeR.setTextColor(this.ylL.getResources().getColor(2131690240));
        }
        else if (locala.ymr == b.ymA)
        {
          this.yeR.setTextColor(-2601405);
        }
        else if (locala.ymr == b.ymE)
        {
          this.lXZ.setVisibility(0);
          this.lXZ.setBackgroundResource(2130838006);
          this.yeR.setVisibility(8);
        }
        else if (this.ylT != 0)
        {
          this.yeR.setTextColor(this.ylT);
        }
        else if (this.qlP)
        {
          this.yeR.setTextColor(com.tencent.mm.bz.a.h(this.ylL, 2131690780));
        }
      }
      else
      {
        this.yeR.setTextColor(com.tencent.mm.bz.a.h(this.ylL, 2131690723));
      }
    }
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    com.tencent.mm.compatible.b.g.KO();
    com.tencent.mm.compatible.b.g.KO();
    if ((this.ylM) && (this.elS != null) && (this.elS.onKeyDown(paramInt, paramKeyEvent)))
    {
      ab.d("MicroMsg.MMActivityController", "match search view on key down");
      if (this.qlP)
        xE(this.ylL.getResources().getColor(2131689913));
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      xE(this.ylL.getResources().getColor(2131690310));
      break;
    }
  }

  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    if ((paramInt == 82) && (paramKeyEvent.getAction() == 1))
    {
      bool2 = bool1;
      if (this.yme != null)
      {
        bool2 = bool1;
        if (this.yme.enable)
          a(this.ymf, this.yme);
      }
    }
    for (boolean bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public abstract void onKeyboardStateChanged();

  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    ab.v("MicroMsg.MMActivityController", "on options item selected");
    boolean bool;
    if (!this.ylz)
    {
      ab.w("MicroMsg.MMActivityController", "onOptionsItemSelected screen not enable.");
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((paramMenuItem.getItemId() == this.ylN.yfi) && (this.ylN.enable))
      {
        a(paramMenuItem, this.ylN);
        bool = true;
      }
      else
      {
        Iterator localIterator = this.yfa.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            a locala = (a)localIterator.next();
            if (paramMenuItem.getItemId() == locala.yfi)
            {
              ab.d("MicroMsg.MMActivityController", "on option menu %d click", new Object[] { Integer.valueOf(paramMenuItem.getItemId()) });
              a(paramMenuItem, locala);
              bool = true;
              break;
            }
          }
        bool = false;
      }
    }
  }

  public final void onPause()
  {
    activateBroadcast(false);
    com.tencent.mm.sdk.b.a.xxA.d(this.ylX);
  }

  public final boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    ab.d("MicroMsg.MMActivityController", "on prepare option menu");
    if ((this.ylM) && (this.elS != null))
      this.elS.a(this.ylL, paramMenu);
    return true;
  }

  public final void onResume()
  {
    activateBroadcast(true);
    com.tencent.mm.sdk.b.a.xxA.c(this.ylX);
    Object localObject1 = new com.tencent.mm.g.a.ak();
    ((com.tencent.mm.g.a.ak)localObject1).cto.type = 2;
    ((com.tencent.mm.g.a.ak)localObject1).cto.position = this.ylV;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    Object localObject2;
    int i;
    if (((com.tencent.mm.g.a.ak)localObject1).ctp.cts == 2)
    {
      long l = System.currentTimeMillis();
      localObject2 = ((com.tencent.mm.g.a.ak)localObject1).ctp.ctu;
      i = ((com.tencent.mm.g.a.ak)localObject1).ctp.position;
      ab.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onResume position[%d], noticeId[%s]", new Object[] { Integer.valueOf(i), localObject2 });
      if ((i > 0) && (i != this.ylV))
      {
        ab.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onResume position not match[%d, %d] ignore display", new Object[] { Integer.valueOf(i), Integer.valueOf(this.ylV) });
        ab.v("MicroMsg.INIT", "KEVIN MMActivity onResume initNotifyView:" + (System.currentTimeMillis() - l));
      }
    }
    else if ((com.tencent.mm.kernel.g.RK()) && (com.tencent.mm.kernel.g.RN().eJb) && (!com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_fontScaleTip", 0).getBoolean("font_scale_tip", true)))
    {
      if (1.0F != com.tencent.mm.bz.a.dm(com.tencent.mm.sdk.platformtools.ah.getContext()))
        break label470;
      if (1.0F != com.tencent.mm.sdk.platformtools.ah.getContext().getResources().getConfiguration().fontScale)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(15181, new Object[] { Integer.valueOf(1) });
        localObject2 = new e.a(com.tencent.mm.sdk.platformtools.ah.getContext());
        localObject1 = ((e.a)localObject2).al(this.ylL.getResources().getString(2131300020)).asL(this.ylL.getResources().getString(2131300017));
        ((e.a)localObject1).zQJ = this.ylL.getResources().getString(2131300019);
        ((e.a)localObject1).zQK = this.ylL.getResources().getString(2131300018);
        ((e.a)localObject2).c(new e.c()
        {
          public final void d(boolean paramAnonymousBoolean, String paramAnonymousString)
          {
            AppMethodBeat.i(106010);
            if (paramAnonymousBoolean)
            {
              com.tencent.mm.plugin.report.service.h.pYm.e(15181, new Object[] { Integer.valueOf(3) });
              paramAnonymousString = new Intent();
              paramAnonymousString.setClassName(com.tencent.mm.sdk.platformtools.ah.getPackageName(), "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI");
              paramAnonymousString.addFlags(268435456);
              com.tencent.mm.sdk.platformtools.ah.getContext().startActivity(paramAnonymousString);
              AppMethodBeat.o(106010);
            }
            while (true)
            {
              return;
              com.tencent.mm.plugin.report.service.h.pYm.e(15181, new Object[] { Integer.valueOf(2) });
              AppMethodBeat.o(106010);
            }
          }
        }).show();
        com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_fontScaleTip", 0).edit().putBoolean("font_scale_tip", true).apply();
      }
    }
    while (true)
    {
      return;
      a(((com.tencent.mm.g.a.ak)localObject1).ctp.ctt, ((com.tencent.mm.g.a.ak)localObject1).ctp.aIB, ((com.tencent.mm.g.a.ak)localObject1).ctp.url, ((com.tencent.mm.g.a.ak)localObject1).ctp.desc, (String)localObject2, i, true);
      break;
      label470: com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA() + "_fontScaleTip", 0).edit().putBoolean("font_scale_tip", true).apply();
    }
  }

  public final void onStart()
  {
    this.ylk = this.mContext.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0).getBoolean("settings_landscape_mode", false);
    if (this.ylk)
      this.ylL.setRequestedOrientation(-1);
    while (true)
    {
      return;
      this.ylL.setRequestedOrientation(1);
    }
  }

  public final void removeAllOptionMenu()
  {
    if (this.yfa.isEmpty());
    while (true)
    {
      return;
      this.yfa.clear();
      supportInvalidateOptionsMenu();
    }
  }

  public final boolean removeOptionMenu(int paramInt)
  {
    boolean bool1 = false;
    for (int i = 0; ; i++)
    {
      boolean bool2 = bool1;
      if (i < this.yfa.size())
      {
        if (((a)this.yfa.get(i)).yfi == paramInt)
        {
          ab.d("MicroMsg.MMActivityController", "match menu, id %d, remove it", new Object[] { Integer.valueOf(paramInt) });
          this.yfa.remove(i);
          supportInvalidateOptionsMenu();
          bool2 = true;
        }
      }
      else
        return bool2;
    }
  }

  public final void setBackBtn(final MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    if (this.mActionBar == null)
      return;
    if (paramOnMenuItemClickListener == null)
      this.mActionBar.setDisplayHomeAsUpEnabled(false);
    while (true)
    {
      int i = paramInt;
      if (paramInt == 0)
        i = 2131230737;
      if ((this.ylS != null) && (i != 0))
        this.ylS.setImageResource(i);
      this.ylN.yfi = 16908332;
      this.ylN.gzB = paramOnMenuItemClickListener;
      break;
      this.mActionBar.setDisplayHomeAsUpEnabled(false);
      if (this.ylR != null)
        this.ylR.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(106001);
            paramAnonymousView.setSelected(false);
            paramAnonymousView.setPressed(false);
            paramAnonymousView.clearFocus();
            paramAnonymousView.invalidate();
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(106000);
                q.6.this.kiI.onMenuItemClick(null);
                AppMethodBeat.o(106000);
              }
            });
            AppMethodBeat.o(106001);
          }
        });
    }
  }

  public final void setBackGroundColorResource(int paramInt)
  {
    if (this.contentView == null);
    while (true)
    {
      return;
      if (this.yly == null)
        this.yly = ((FrameLayout)this.contentView.findViewById(2131825953));
      this.yly.setBackgroundResource(paramInt);
      this.ylv.setBackgroundResource(paramInt);
    }
  }

  public final void setMMSubTitle(int paramInt)
  {
    if (this.mActionBar == null);
    while (true)
    {
      return;
      this.jcI.setText(this.mContext.getString(paramInt));
      if (com.tencent.mm.bz.a.ga(this.ylL))
      {
        this.jcI.setTextSize(1, 14.0F);
        this.ylQ.setTextSize(1, 18.0F);
      }
      this.jcI.setVisibility(0);
      updateDescription(this.mContext.getString(paramInt));
    }
  }

  public final void setMMSubTitle(String paramString)
  {
    if (this.mActionBar == null);
    while (true)
    {
      return;
      if (paramString == null)
      {
        this.jcI.setVisibility(8);
      }
      else
      {
        this.jcI.setText(paramString);
        if (com.tencent.mm.bz.a.ga(this.ylL))
        {
          this.jcI.setTextSize(1, 14.0F);
          this.ylQ.setTextSize(1, 18.0F);
        }
        this.jcI.setVisibility(0);
        updateDescription(paramString);
      }
    }
  }

  public final void setMMTitle(int paramInt)
  {
    setMMTitle(this.mContext.getString(paramInt));
  }

  public final void setMMTitle(String paramString)
  {
    if (this.mActionBar == null);
    while (true)
    {
      return;
      this.ylA = paramString;
      if (com.tencent.mm.bz.a.ga(this.ylL))
        this.ylQ.setTextSize(0, com.tencent.mm.bz.a.am(this.ylL, 2131427496) * com.tencent.mm.bz.a.fY(this.ylL));
      dym();
      updateDescription(paramString);
    }
  }

  public final void setScreenEnable(boolean paramBoolean)
  {
    boolean bool1 = true;
    this.ylz = paramBoolean;
    if ((this.ylu == null) && (this.contentView != null))
      this.ylu = this.contentView.findViewById(2131825954);
    if (this.ylu == null)
      ab.e("MicroMsg.MMActivityController", "jacks error npe translayer !");
    while (true)
    {
      return;
      View localView = this.ylu;
      if (!paramBoolean)
      {
        bool2 = true;
        label63: localView.setFocusable(bool2);
        localView = this.ylu;
        if (paramBoolean)
          break label108;
      }
      label108: for (boolean bool2 = bool1; ; bool2 = false)
      {
        localView.setFocusableInTouchMode(bool2);
        if (paramBoolean)
          break label114;
        hp(this.ylL);
        break;
        bool2 = false;
        break label63;
      }
      label114: releaseWakeLock();
    }
  }

  public final void setTitleBarDoubleClickListener(final Runnable paramRunnable)
  {
    if ((this.mActionBar == null) || (paramRunnable == null));
    while (true)
    {
      return;
      this.mActionBar.getCustomView().setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(105998);
          if (SystemClock.elapsedRealtime() - q.k(q.this) < 300L)
            paramRunnable.run();
          q.a(q.this, SystemClock.elapsedRealtime());
          AppMethodBeat.o(105998);
        }
      });
    }
  }

  public final void setTitleLogo(int paramInt1, int paramInt2)
  {
    if (this.mActionBar == null)
      return;
    if (paramInt1 == 0)
    {
      this.ylB = 0;
      this.ylD = null;
      label22: if (paramInt2 != 0)
        break label84;
      this.ylC = 0;
      this.ylE = null;
    }
    while (true)
    {
      dym();
      break;
      if (this.ylB == paramInt1)
        break label22;
      this.ylB = paramInt1;
      this.ylD = hb(this.mContext.getResources().getDimensionPixelSize(2131427505), this.ylB);
      break label22;
      label84: if (this.ylC != paramInt2)
      {
        this.ylC = paramInt2;
        this.ylE = hb(this.mContext.getResources().getDimensionPixelSize(2131427505), this.ylC);
      }
    }
  }

  public final void setTitleMuteIconVisibility(int paramInt)
  {
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      this.ylI = bool;
      dym();
      return;
    }
  }

  public final void setTitleVisibility(int paramInt)
  {
    if (this.mActionBar == null);
    while (true)
    {
      return;
      if (paramInt == 0)
      {
        this.mActionBar.show();
        l(this.ylL, this.yeO);
      }
      else
      {
        this.mActionBar.hide();
        l(this.ylL, this.ylL.getResources().getColor(2131689761));
      }
    }
  }

  public final void showHomeBtn(boolean paramBoolean)
  {
    if (this.mActionBar == null);
    do
    {
      return;
      this.mActionBar.setDisplayHomeAsUpEnabled(paramBoolean);
    }
    while (this.ylR == null);
    View localView = this.ylR;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      break;
    }
  }

  public final void showTitleView()
  {
    boolean bool = true;
    if (this.mActionBar != null)
    {
      ab.v("MicroMsg.MMActivityController", "showTitleView hasTitle:%b", new Object[] { Boolean.valueOf(bool) });
      if (this.mActionBar != null)
        break label41;
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label41: this.mActionBar.show();
    }
  }

  public void supportInvalidateOptionsMenu()
  {
    this.ylL.supportInvalidateOptionsMenu();
  }

  protected final void updateDescription(String paramString)
  {
    a.a.dzk().h(this.ylL, paramString);
  }

  public final void updateOptionMenuIcon(int paramInt1, int paramInt2)
  {
    a locala = Ng(paramInt1);
    if ((locala != null) && (locala.yfj != paramInt2))
    {
      locala.yfj = paramInt2;
      supportInvalidateOptionsMenu();
    }
  }

  public final void updateOptionMenuListener(int paramInt, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    a locala = Ng(paramInt);
    if (locala != null)
    {
      locala.gzB = paramOnMenuItemClickListener;
      locala.mlV = paramOnLongClickListener;
    }
  }

  public final void updateOptionMenuText(int paramInt, String paramString)
  {
    a locala = Ng(paramInt);
    if ((locala != null) && (!bo.bc(paramString, "").equals(locala.text)))
    {
      locala.text = paramString;
      supportInvalidateOptionsMenu();
    }
  }

  public final void xE(int paramInt)
  {
    if (this.mActionBar == null);
    while (true)
    {
      return;
      this.yeO = paramInt;
      this.qlP = ah.Nw(this.yeO);
      this.mActionBar.setBackgroundDrawable(new ColorDrawable(this.yeO));
      l(this.ylL, this.yeO);
      dyo();
      dyn();
    }
  }

  public static final class a
  {
    public boolean aIB = true;
    public boolean enable = true;
    public MenuItem.OnMenuItemClickListener gzB;
    public View.OnLongClickListener mlV;
    public String text;
    public int textColor;
    public int yfi = -1;
    public int yfj;
    public View yfk;
    public View yfl;
    public int ymp = 0;
    public Drawable ymq;
    public q.b ymr = q.b.ymt;
    public boolean yms = false;
  }

  public static enum b
  {
    static
    {
      AppMethodBeat.i(106015);
      ymt = new b("NORMAL", 0);
      ymu = new b("GREEN", 1);
      ymv = new b("RED", 2);
      ymw = new b("BLACK", 3);
      ymx = new b("TRANSPARENT", 4);
      ymy = new b("TRANSPARENT_RED_TEXT", 5);
      ymz = new b("TRANSPARENT_GREEN_TEXT", 6);
      ymA = new b("GOLDEN", 7);
      ymB = new b("TRANSPARENT_GOLD_TEXT", 8);
      ymC = new b("TRANSPARENT_GB_GREEN_TEXT", 9);
      ymD = new b("TRANSPARENT_BG_BLACK_TEXT", 10);
      ymE = new b("YELLOW", 11);
      ymF = new b[] { ymt, ymu, ymv, ymw, ymx, ymy, ymz, ymA, ymB, ymC, ymD, ymE };
      AppMethodBeat.o(106015);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.q
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.g;
import android.support.v4.view.g.d;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;

public class o
{
  final String TAG;
  ak fbD;
  MenuItem mjk;
  boolean zGU;
  public boolean zGV;
  private boolean zGW;
  private boolean zGX;
  boolean zGY;
  public d zGZ;
  public b zHa;
  private SearchViewNotRealTimeHelper.a zHb;
  private boolean zHc;
  private ArrayList<String> zHd;
  private boolean zHe;
  public int zHf;
  private int zHg;
  a zHh;

  public o()
  {
    AppMethodBeat.i(107772);
    this.zGU = false;
    this.zGV = false;
    this.zGW = false;
    this.zGX = true;
    this.zGY = true;
    this.mjk = null;
    this.fbD = new ak(Looper.getMainLooper());
    this.zGZ = null;
    this.zHc = true;
    this.zHf = 2131296899;
    this.zHg = 0;
    this.zHc = true;
    this.zGU = false;
    this.TAG = ("MicroMsg.SearchViewHelper-" + String.valueOf(System.currentTimeMillis()));
    AppMethodBeat.o(107772);
  }

  public o(byte paramByte)
  {
    AppMethodBeat.i(107773);
    this.zGU = false;
    this.zGV = false;
    this.zGW = false;
    this.zGX = true;
    this.zGY = true;
    this.mjk = null;
    this.fbD = new ak(Looper.getMainLooper());
    this.zGZ = null;
    this.zHc = true;
    this.zHf = 2131296899;
    this.zHg = 0;
    this.zHc = true;
    this.zGU = true;
    this.TAG = ("MicroMsg.SearchViewHelper-" + String.valueOf(System.currentTimeMillis()));
    AppMethodBeat.o(107773);
  }

  private void b(final Activity paramActivity, Menu paramMenu)
  {
    AppMethodBeat.i(107780);
    if ((this.zGX) && ((this.zGV) || (this.zGW)))
    {
      this.zGW = false;
      if ((paramActivity instanceof MMActivity))
        ((MMActivity)paramActivity).xE(ah.getContext().getResources().getColor(2131690310));
      if (paramMenu != null)
        for (int i = 0; i < paramMenu.size(); i++)
        {
          MenuItem localMenuItem = paramMenu.getItem(i);
          if (localMenuItem.getItemId() != 2131820645)
            localMenuItem.setVisible(false);
        }
      this.fbD.postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(107769);
          if (o.this.mjk == null)
          {
            ab.w(o.this.TAG, "on post expand search menu, but item is null");
            AppMethodBeat.o(107769);
            return;
          }
          ab.i(o.this.TAG, "try to expand action view, searchViewExpand %B", new Object[] { Boolean.valueOf(o.this.zGV) });
          if (o.this.zGU)
            if (!o.this.zGV)
              g.b(o.this.mjk);
          while (true)
          {
            final View localView = g.a(o.this.mjk);
            if ((localView != null) && (o.this.zGV))
            {
              localView.findViewById(2131820980).requestFocus();
              if (o.this.zGY)
                o.this.fbD.postDelayed(new Runnable()
                {
                  public final void run()
                  {
                    AppMethodBeat.i(107768);
                    ((InputMethodManager)o.10.this.val$activity.getSystemService("input_method")).showSoftInput(localView.findViewById(2131820980), 0);
                    AppMethodBeat.o(107768);
                  }
                }
                , 128L);
            }
            AppMethodBeat.o(107769);
            break;
            if (o.this.zHh != null)
              o.this.zHh.dJT();
          }
        }
      }
      , 128L);
    }
    AppMethodBeat.o(107780);
  }

  public void a(Activity paramActivity, Menu paramMenu)
  {
    AppMethodBeat.i(107779);
    ab.v(this.TAG, "on prepare options menu, searchViewExpand %B, triggerExpand %B, canExpand %B", new Object[] { Boolean.valueOf(this.zGV), Boolean.valueOf(this.zGW), Boolean.valueOf(this.zGX) });
    if (paramActivity == null)
    {
      ab.w(this.TAG, "on hanle status fail, activity is null");
      AppMethodBeat.o(107779);
    }
    while (true)
    {
      return;
      this.mjk = paramMenu.findItem(2131820645);
      if (this.mjk == null)
      {
        ab.w(this.TAG, "can not find search menu, error");
        AppMethodBeat.o(107779);
      }
      else
      {
        this.mjk.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            return false;
          }
        });
        b(paramActivity, paramMenu);
        AppMethodBeat.o(107779);
      }
    }
  }

  public void a(final FragmentActivity paramFragmentActivity, Menu paramMenu)
  {
    AppMethodBeat.i(107778);
    ab.v(this.TAG, "on create options menu");
    if (paramFragmentActivity == null)
    {
      ab.w(this.TAG, "on add search menu, activity is null");
      AppMethodBeat.o(107778);
      return;
    }
    if (this.zGZ == null)
    {
      if (this.zHc)
      {
        this.zGZ = new ActionBarSearchView(paramFragmentActivity);
        label59: this.zGZ.setAutoMatchKeywords(this.zHe);
        this.zGZ.setKeywords(this.zHd);
      }
    }
    else
    {
      this.zGZ.setCallBack(new ActionBarSearchView.b()
      {
        public final void Qa(String paramAnonymousString)
        {
          AppMethodBeat.i(107757);
          if (!o.this.zGV)
          {
            ab.v(o.this.TAG, "onSearchTextChange %s, but not in searching", new Object[] { paramAnonymousString });
            AppMethodBeat.o(107757);
          }
          while (true)
          {
            return;
            if (o.this.zHa != null)
              o.this.zHa.vO(paramAnonymousString);
            AppMethodBeat.o(107757);
          }
        }

        public final void apq()
        {
          AppMethodBeat.i(107758);
          if (o.this.zHa != null)
            o.this.zHa.apq();
          AppMethodBeat.o(107758);
        }

        public final void bKt()
        {
          AppMethodBeat.i(107756);
          if (o.this.zHa != null)
            o.this.zHa.apr();
          AppMethodBeat.o(107756);
        }

        public final void bKu()
        {
          AppMethodBeat.i(107755);
          if (!o.this.zGV)
          {
            ab.v(o.this.TAG, "onVoiceSearchRequired, but not in searching");
            AppMethodBeat.o(107755);
          }
          while (true)
          {
            return;
            o.this.amH();
            AppMethodBeat.o(107755);
          }
        }
      });
      this.zGZ.qN(amG());
      this.zGZ.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          AppMethodBeat.i(107762);
          boolean bool;
          if ((3 == paramAnonymousInt) && (o.this.zHa != null))
          {
            bool = o.this.zHa.vN(o.this.getSearchContent());
            AppMethodBeat.o(107762);
          }
          while (true)
          {
            return bool;
            bool = false;
            AppMethodBeat.o(107762);
          }
        }
      });
      if (this.zHg != 0)
        this.zGZ.setSearchTipIcon(this.zHg);
      this.mjk = paramMenu.add(0, 2131820645, 0, this.zHf);
      this.mjk.setEnabled(this.zGX);
      this.mjk.setIcon(2131230741);
      g.a(this.mjk, (View)this.zGZ);
      if (!this.zGU)
        break label305;
      g.a(this.mjk, 9);
      label228: if (!this.zGU)
        break label316;
      g.a(this.mjk, new g.d()
      {
        public final boolean eo()
        {
          AppMethodBeat.i(107763);
          o.this.a(paramFragmentActivity, false);
          AppMethodBeat.o(107763);
          return true;
        }

        public final boolean ep()
        {
          AppMethodBeat.i(107764);
          o.this.b(paramFragmentActivity, false);
          AppMethodBeat.o(107764);
          return true;
        }
      });
    }
    while (true)
    {
      this.zGZ.setBackClickCallback(new ActionBarSearchView.a()
      {
        public final void bKv()
        {
          AppMethodBeat.i(107767);
          if (o.this.zGU)
          {
            if (o.this.mjk == null)
              break label64;
            g.c(o.this.mjk);
            AppMethodBeat.o(107767);
          }
          while (true)
          {
            return;
            if (o.this.zHh != null)
              o.this.zHh.collapseActionView();
            label64: AppMethodBeat.o(107767);
          }
        }
      });
      AppMethodBeat.o(107778);
      break;
      this.zGZ = new SearchViewNotRealTimeHelper(paramFragmentActivity);
      this.zGZ.setNotRealCallBack(this.zHb);
      break label59;
      label305: g.a(this.mjk, 2);
      break label228;
      label316: this.zHh = new a()
      {
        public final void collapseActionView()
        {
          AppMethodBeat.i(107766);
          o.this.b(paramFragmentActivity, true);
          AppMethodBeat.o(107766);
        }

        public final void dJT()
        {
          AppMethodBeat.i(107765);
          o.this.a(paramFragmentActivity, true);
          AppMethodBeat.o(107765);
        }
      };
    }
  }

  public final void a(final FragmentActivity paramFragmentActivity, final boolean paramBoolean)
  {
    AppMethodBeat.i(107786);
    ab.d(this.TAG, "doNewExpand, searchViewExpand " + this.zGV);
    if (!this.zGV)
    {
      this.zGV = true;
      b(paramFragmentActivity, null);
      this.fbD.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(107771);
          if ((paramFragmentActivity == null) || (paramFragmentActivity.isFinishing()))
          {
            ab.w(o.this.TAG, "want to expand search view, but activity status error");
            AppMethodBeat.o(107771);
          }
          while (true)
          {
            return;
            if (paramBoolean)
              paramFragmentActivity.supportInvalidateOptionsMenu();
            AppMethodBeat.o(107771);
          }
        }
      });
      if (this.zHa != null)
        this.zHa.app();
    }
    AppMethodBeat.o(107786);
  }

  protected boolean amG()
  {
    return false;
  }

  protected void amH()
  {
  }

  protected void amI()
  {
  }

  public final void b(final FragmentActivity paramFragmentActivity, final boolean paramBoolean)
  {
    AppMethodBeat.i(107787);
    ab.d(this.TAG, "doNewCollapse, searchViewExpand " + this.zGV);
    if (this.zGV)
    {
      this.zGV = false;
      amI();
      if (this.zGZ != null)
        this.zGZ.qO(false);
      this.fbD.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(107759);
          if ((paramFragmentActivity == null) || (paramFragmentActivity.isFinishing()))
          {
            ab.w(o.this.TAG, "want to collapse search view, but activity status error");
            AppMethodBeat.o(107759);
          }
          while (true)
          {
            return;
            if (paramBoolean)
              paramFragmentActivity.supportInvalidateOptionsMenu();
            AppMethodBeat.o(107759);
          }
        }
      });
      if (this.zHa != null)
        this.fbD.post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(107760);
            if (o.this.zHa != null)
              o.this.zHa.apo();
            AppMethodBeat.o(107760);
          }
        });
    }
    this.fbD.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(107761);
        if (o.this.mjk == null)
        {
          ab.w(o.this.TAG, "want to collapse search view, but search menu item is null");
          AppMethodBeat.o(107761);
        }
        while (true)
        {
          return;
          if ((paramFragmentActivity != null) && (!paramFragmentActivity.isFinishing()))
          {
            Object localObject1 = paramFragmentActivity;
            localObject2 = (InputMethodManager)((FragmentActivity)localObject1).getSystemService("input_method");
            if (localObject2 != null)
            {
              localObject1 = ((FragmentActivity)localObject1).getCurrentFocus();
              if (localObject1 != null)
              {
                localObject1 = ((View)localObject1).getWindowToken();
                if (localObject1 != null)
                  ((InputMethodManager)localObject2).hideSoftInputFromWindow((IBinder)localObject1, 0);
              }
            }
          }
          Object localObject2 = g.a(o.this.mjk);
          if (localObject2 != null)
            ((View)localObject2).findViewById(2131820980).clearFocus();
          AppMethodBeat.o(107761);
        }
      }
    });
    AppMethodBeat.o(107787);
  }

  public final void clearFocus()
  {
    AppMethodBeat.i(107777);
    if (this.zGZ != null)
      this.zGZ.dJr();
    AppMethodBeat.o(107777);
  }

  public final void dJS()
  {
    AppMethodBeat.i(107783);
    ab.d(this.TAG, "do collapse");
    if ((this.zGV) && (this.mjk != null))
      if (this.zGU)
      {
        g.c(this.mjk);
        AppMethodBeat.o(107783);
      }
    while (true)
    {
      return;
      if (this.zHh != null)
        this.zHh.collapseActionView();
      AppMethodBeat.o(107783);
    }
  }

  public final boolean dJs()
  {
    AppMethodBeat.i(107784);
    boolean bool;
    if (this.zGZ != null)
    {
      bool = this.zGZ.dJs();
      AppMethodBeat.o(107784);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107784);
    }
  }

  public final boolean dJt()
  {
    AppMethodBeat.i(107785);
    boolean bool;
    if (this.zGZ != null)
    {
      bool = this.zGZ.dJt();
      AppMethodBeat.o(107785);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107785);
    }
  }

  public final String getSearchContent()
  {
    AppMethodBeat.i(107774);
    String str;
    if (this.zGZ != null)
    {
      str = this.zGZ.getSearchContent();
      AppMethodBeat.o(107774);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(107774);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(107781);
    ab.v(this.TAG, "on key down, key code %d, expand %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.zGV) });
    if ((4 == paramInt) && (this.zGV))
    {
      dJS();
      AppMethodBeat.o(107781);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(107781);
      bool = false;
    }
  }

  public final void qQ(boolean paramBoolean)
  {
    boolean bool1 = false;
    AppMethodBeat.i(107782);
    String str = this.TAG;
    boolean bool2 = this.zGV;
    if (this.mjk == null)
      bool1 = true;
    ab.d(str, "do expand, expanded[%B], search menu item null[%B]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
    if (this.zGV)
      AppMethodBeat.o(107782);
    while (true)
    {
      return;
      if (!this.zGX)
      {
        ab.w(this.TAG, "can not expand now");
        AppMethodBeat.o(107782);
      }
      else
      {
        this.zGY = paramBoolean;
        if (this.mjk != null)
        {
          this.fbD.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(107770);
              if (o.this.mjk == null)
              {
                ab.w(o.this.TAG, "post do expand search menu, but search menu item is null");
                AppMethodBeat.o(107770);
              }
              while (true)
              {
                return;
                if (o.this.zGU)
                {
                  g.b(o.this.mjk);
                  AppMethodBeat.o(107770);
                }
                else
                {
                  if (o.this.zHh != null)
                    o.this.zHh.dJT();
                  AppMethodBeat.o(107770);
                }
              }
            }
          });
          AppMethodBeat.o(107782);
        }
        else
        {
          this.zGW = true;
          AppMethodBeat.o(107782);
        }
      }
    }
  }

  public final void setHint(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(107776);
    if (this.zGZ == null)
      AppMethodBeat.o(107776);
    while (true)
    {
      return;
      this.zGZ.setHint(paramCharSequence);
      AppMethodBeat.o(107776);
    }
  }

  public void setSearchContent(String paramString)
  {
    AppMethodBeat.i(107775);
    if (this.zGZ == null)
      AppMethodBeat.o(107775);
    while (true)
    {
      return;
      this.zGZ.setSearchContent(paramString);
      AppMethodBeat.o(107775);
    }
  }

  public static abstract interface a
  {
    public abstract void collapseActionView();

    public abstract void dJT();
  }

  public static abstract interface b
  {
    public abstract void apo();

    public abstract void app();

    public abstract void apq();

    public abstract void apr();

    public abstract boolean vN(String paramString);

    public abstract void vO(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.o
 * JD-Core Version:    0.6.2
 */
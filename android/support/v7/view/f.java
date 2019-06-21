package android.support.v7.view;

import android.content.Context;
import android.support.v4.b.a.a;
import android.support.v4.f.m;
import android.support.v7.view.menu.q;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

public final class f extends ActionMode
{
  final b YQ;
  final Context mContext;

  public f(Context paramContext, b paramb)
  {
    this.mContext = paramContext;
    this.YQ = paramb;
  }

  public final void finish()
  {
    this.YQ.finish();
  }

  public final View getCustomView()
  {
    return this.YQ.getCustomView();
  }

  public final Menu getMenu()
  {
    return q.a(this.mContext, (a)this.YQ.getMenu());
  }

  public final MenuInflater getMenuInflater()
  {
    return this.YQ.getMenuInflater();
  }

  public final CharSequence getSubtitle()
  {
    return this.YQ.getSubtitle();
  }

  public final Object getTag()
  {
    return this.YQ.sO;
  }

  public final CharSequence getTitle()
  {
    return this.YQ.getTitle();
  }

  public final boolean getTitleOptionalHint()
  {
    return this.YQ.YM;
  }

  public final void invalidate()
  {
    this.YQ.invalidate();
  }

  public final boolean isTitleOptional()
  {
    return this.YQ.isTitleOptional();
  }

  public final void setCustomView(View paramView)
  {
    this.YQ.setCustomView(paramView);
  }

  public final void setSubtitle(int paramInt)
  {
    this.YQ.setSubtitle(paramInt);
  }

  public final void setSubtitle(CharSequence paramCharSequence)
  {
    this.YQ.setSubtitle(paramCharSequence);
  }

  public final void setTag(Object paramObject)
  {
    this.YQ.sO = paramObject;
  }

  public final void setTitle(int paramInt)
  {
    this.YQ.setTitle(paramInt);
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    this.YQ.setTitle(paramCharSequence);
  }

  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    this.YQ.setTitleOptionalHint(paramBoolean);
  }

  public static final class a
    implements b.a
  {
    final ActionMode.Callback YR;
    final ArrayList<f> YS;
    final m<Menu, Menu> YT;
    final Context mContext;

    public a(Context paramContext, ActionMode.Callback paramCallback)
    {
      this.mContext = paramContext;
      this.YR = paramCallback;
      this.YS = new ArrayList();
      this.YT = new m();
    }

    private Menu b(Menu paramMenu)
    {
      Menu localMenu1 = (Menu)this.YT.get(paramMenu);
      Menu localMenu2 = localMenu1;
      if (localMenu1 == null)
      {
        localMenu2 = q.a(this.mContext, (a)paramMenu);
        this.YT.put(paramMenu, localMenu2);
      }
      return localMenu2;
    }

    public final void a(b paramb)
    {
      this.YR.onDestroyActionMode(b(paramb));
    }

    public final boolean a(b paramb, Menu paramMenu)
    {
      return this.YR.onCreateActionMode(b(paramb), b(paramMenu));
    }

    public final boolean a(b paramb, MenuItem paramMenuItem)
    {
      return this.YR.onActionItemClicked(b(paramb), q.a(this.mContext, (android.support.v4.b.a.b)paramMenuItem));
    }

    public final ActionMode b(b paramb)
    {
      int i = this.YS.size();
      int j = 0;
      if (j < i)
      {
        f localf = (f)this.YS.get(j);
        if ((localf != null) && (localf.YQ == paramb))
          paramb = localf;
      }
      while (true)
      {
        return paramb;
        j++;
        break;
        paramb = new f(this.mContext, paramb);
        this.YS.add(paramb);
      }
    }

    public final boolean b(b paramb, Menu paramMenu)
    {
      return this.YR.onPrepareActionMode(b(paramb), b(paramMenu));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.f
 * JD-Core Version:    0.6.2
 */
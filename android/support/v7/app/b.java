package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.s;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public final class b extends i
  implements DialogInterface
{
  public final AlertController Uz = new AlertController(getContext(), this, getWindow());

  protected b(Context paramContext, int paramInt)
  {
    super(paramContext, j(paramContext, paramInt));
  }

  static int j(Context paramContext, int paramInt)
  {
    if ((paramInt >>> 24 & 0xFF) > 0);
    while (true)
    {
      return paramInt;
      TypedValue localTypedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(2130772214, localTypedValue, true);
      paramInt = localTypedValue.resourceId;
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    AlertController localAlertController = this.Uz;
    int i;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    label95: label101: label377: int j;
    label203: label477: label613: int k;
    label325: label596: label631: int n;
    label427: label729: int i2;
    if ((localAlertController.TJ != 0) && (localAlertController.TP == 1))
    {
      i = localAlertController.TJ;
      localAlertController.Th.setContentView(i);
      paramBundle = localAlertController.Ti.findViewById(2131820918);
      localObject1 = paramBundle.findViewById(2131820927);
      localObject2 = paramBundle.findViewById(2131820919);
      localObject3 = paramBundle.findViewById(2131820916);
      localObject4 = (ViewGroup)paramBundle.findViewById(2131820925);
      if (localAlertController.mView == null)
        break label957;
      paramBundle = localAlertController.mView;
      if (paramBundle == null)
        break label990;
      i = 1;
      if ((i == 0) || (!AlertController.aQ(paramBundle)))
        localAlertController.Ti.setFlags(131072, 131072);
      if (i == 0)
        break label995;
      Object localObject5 = (FrameLayout)localAlertController.Ti.findViewById(2131820926);
      ((FrameLayout)localObject5).addView(paramBundle, new ViewGroup.LayoutParams(-1, -1));
      if (localAlertController.Tq)
        ((FrameLayout)localObject5).setPadding(localAlertController.Tm, localAlertController.Tn, localAlertController.To, localAlertController.Tp);
      if (localAlertController.mListView != null)
        ((LinearLayoutCompat.LayoutParams)((ViewGroup)localObject4).getLayoutParams()).weight = 0.0F;
      View localView = ((ViewGroup)localObject4).findViewById(2131820927);
      localObject5 = ((ViewGroup)localObject4).findViewById(2131820919);
      paramBundle = ((ViewGroup)localObject4).findViewById(2131820916);
      localObject1 = AlertController.c(localView, (View)localObject1);
      localObject2 = AlertController.c((View)localObject5, (View)localObject2);
      paramBundle = AlertController.c(paramBundle, (View)localObject3);
      localAlertController.TD = ((NestedScrollView)localAlertController.Ti.findViewById(2131820921));
      localAlertController.TD.setFocusable(false);
      localAlertController.TD.setNestedScrollingEnabled(false);
      localAlertController.ma = ((TextView)((ViewGroup)localObject2).findViewById(16908299));
      if (localAlertController.ma != null)
      {
        if (localAlertController.Tk == null)
          break label1005;
        localAlertController.ma.setText(localAlertController.Tk);
      }
      i = 0;
      localAlertController.Tr = ((Button)paramBundle.findViewById(16908313));
      localAlertController.Tr.setOnClickListener(localAlertController.TQ);
      if ((!TextUtils.isEmpty(localAlertController.Ts)) || (localAlertController.Tu != null))
        break label1092;
      localAlertController.Tr.setVisibility(8);
      localAlertController.Tv = ((Button)paramBundle.findViewById(16908314));
      localAlertController.Tv.setOnClickListener(localAlertController.TQ);
      if ((!TextUtils.isEmpty(localAlertController.Tw)) || (localAlertController.Ty != null))
        break label1154;
      localAlertController.Tv.setVisibility(8);
      localAlertController.Tz = ((Button)paramBundle.findViewById(16908315));
      localAlertController.Tz.setOnClickListener(localAlertController.TQ);
      if ((!TextUtils.isEmpty(localAlertController.TA)) || (localAlertController.TC != null))
        break label1218;
      localAlertController.Tz.setVisibility(8);
      localObject3 = localAlertController.mContext;
      localObject5 = new TypedValue();
      ((Context)localObject3).getTheme().resolveAttribute(2130772213, (TypedValue)localObject5, true);
      if (((TypedValue)localObject5).data == 0)
        break label1282;
      j = 1;
      label517: if (j != 0)
      {
        if (i != 1)
          break label1288;
        AlertController.a(localAlertController.Tr);
      }
      label534: if (i == 0)
        break label1318;
      i = 1;
      label540: if (i == 0)
        paramBundle.setVisibility(8);
      if (localAlertController.TG == null)
        break label1323;
      localObject3 = new ViewGroup.LayoutParams(-1, -2);
      ((ViewGroup)localObject1).addView(localAlertController.TG, 0, (ViewGroup.LayoutParams)localObject3);
      localAlertController.Ti.findViewById(2131820928).setVisibility(8);
      if ((localObject4 == null) || (((ViewGroup)localObject4).getVisibility() == 8))
        break label1519;
      i = 1;
      if ((localObject1 == null) || (((ViewGroup)localObject1).getVisibility() == 8))
        break label1524;
      k = 1;
      if ((paramBundle == null) || (paramBundle.getVisibility() == 8))
        break label1530;
      j = 1;
      label647: if ((j == 0) && (localObject2 != null))
      {
        paramBundle = ((ViewGroup)localObject2).findViewById(2131820923);
        if (paramBundle != null)
          paramBundle.setVisibility(0);
      }
      if (k == 0)
        break label1536;
      if (localAlertController.TD != null)
        localAlertController.TD.setClipToPadding(true);
      paramBundle = null;
      if ((localAlertController.Tk != null) || (localAlertController.mListView != null))
        paramBundle = ((ViewGroup)localObject1).findViewById(2131820930);
      if (paramBundle != null)
        paramBundle.setVisibility(0);
      if ((localAlertController.mListView instanceof AlertController.RecycleListView))
      {
        paramBundle = (AlertController.RecycleListView)localAlertController.mListView;
        if ((j == 0) || (k == 0))
        {
          int m = paramBundle.getPaddingLeft();
          if (k == 0)
            break label1562;
          n = paramBundle.getPaddingTop();
          label774: int i1 = paramBundle.getPaddingRight();
          if (j == 0)
            break label1571;
          i2 = paramBundle.getPaddingBottom();
          label791: paramBundle.setPadding(m, n, i1, i2);
        }
      }
      if (i == 0)
      {
        if (localAlertController.mListView == null)
          break label1580;
        paramBundle = localAlertController.mListView;
        label819: if (paramBundle != null)
        {
          if (k == 0)
            break label1588;
          i = 1;
          label830: if (j == 0)
            break label1593;
          j = 2;
          label838: i |= j;
          localObject4 = localAlertController.Ti.findViewById(2131820920);
          localObject1 = localAlertController.Ti.findViewById(2131820924);
          if (Build.VERSION.SDK_INT < 23)
            break label1599;
          s.s(paramBundle, i);
          if (localObject4 != null)
            ((ViewGroup)localObject2).removeView((View)localObject4);
          if (localObject1 != null)
            ((ViewGroup)localObject2).removeView((View)localObject1);
        }
      }
    }
    while (true)
    {
      paramBundle = localAlertController.mListView;
      if ((paramBundle != null) && (localAlertController.Ei != null))
      {
        paramBundle.setAdapter(localAlertController.Ei);
        i = localAlertController.TH;
        if (i >= 0)
        {
          paramBundle.setItemChecked(i, true);
          paramBundle.setSelection(i);
        }
      }
      return;
      i = localAlertController.TI;
      break;
      label957: if (localAlertController.Tl != 0)
      {
        paramBundle = LayoutInflater.from(localAlertController.mContext).inflate(localAlertController.Tl, (ViewGroup)localObject4, false);
        break label95;
      }
      paramBundle = null;
      break label95;
      label990: i = 0;
      break label101;
      label995: ((ViewGroup)localObject4).setVisibility(8);
      break label203;
      label1005: localAlertController.ma.setVisibility(8);
      localAlertController.TD.removeView(localAlertController.ma);
      if (localAlertController.mListView != null)
      {
        localObject3 = (ViewGroup)localAlertController.TD.getParent();
        i = ((ViewGroup)localObject3).indexOfChild(localAlertController.TD);
        ((ViewGroup)localObject3).removeViewAt(i);
        ((ViewGroup)localObject3).addView(localAlertController.mListView, i, new ViewGroup.LayoutParams(-1, -1));
        break label325;
      }
      ((ViewGroup)localObject2).setVisibility(8);
      break label325;
      label1092: localAlertController.Tr.setText(localAlertController.Ts);
      if (localAlertController.Tu != null)
      {
        localAlertController.Tu.setBounds(0, 0, localAlertController.Tj, localAlertController.Tj);
        localAlertController.Tr.setCompoundDrawables(localAlertController.Tu, null, null, null);
      }
      localAlertController.Tr.setVisibility(0);
      i = 1;
      break label377;
      label1154: localAlertController.Tv.setText(localAlertController.Tw);
      if (localAlertController.Ty != null)
      {
        localAlertController.Ty.setBounds(0, 0, localAlertController.Tj, localAlertController.Tj);
        localAlertController.Tv.setCompoundDrawables(localAlertController.Ty, null, null, null);
      }
      localAlertController.Tv.setVisibility(0);
      i |= 2;
      break label427;
      label1218: localAlertController.Tz.setText(localAlertController.TA);
      if (localAlertController.Tu != null)
      {
        localAlertController.Tu.setBounds(0, 0, localAlertController.Tj, localAlertController.Tj);
        localAlertController.Tr.setCompoundDrawables(localAlertController.Tu, null, null, null);
      }
      localAlertController.Tz.setVisibility(0);
      i |= 4;
      break label477;
      label1282: j = 0;
      break label517;
      label1288: if (i == 2)
      {
        AlertController.a(localAlertController.Tv);
        break label534;
      }
      if (i != 4)
        break label534;
      AlertController.a(localAlertController.Tz);
      break label534;
      label1318: i = 0;
      break label540;
      label1323: localAlertController.sX = ((ImageView)localAlertController.Ti.findViewById(16908294));
      if (!TextUtils.isEmpty(localAlertController.IT))
        i = 1;
      while (true)
        if ((i != 0) && (localAlertController.TO))
        {
          localAlertController.TF = ((TextView)localAlertController.Ti.findViewById(2131820929));
          localAlertController.TF.setText(localAlertController.IT);
          if (localAlertController.TE != 0)
          {
            localAlertController.sX.setImageResource(localAlertController.TE);
            break;
            i = 0;
            continue;
          }
          if (localAlertController.rP != null)
          {
            localAlertController.sX.setImageDrawable(localAlertController.rP);
            break;
          }
          localAlertController.TF.setPadding(localAlertController.sX.getPaddingLeft(), localAlertController.sX.getPaddingTop(), localAlertController.sX.getPaddingRight(), localAlertController.sX.getPaddingBottom());
          localAlertController.sX.setVisibility(8);
          break;
        }
      localAlertController.Ti.findViewById(2131820928).setVisibility(8);
      localAlertController.sX.setVisibility(8);
      ((ViewGroup)localObject1).setVisibility(8);
      break label596;
      label1519: i = 0;
      break label613;
      label1524: k = 0;
      break label631;
      label1530: j = 0;
      break label647;
      label1536: if (localObject2 == null)
        break label729;
      paramBundle = ((ViewGroup)localObject2).findViewById(2131820922);
      if (paramBundle == null)
        break label729;
      paramBundle.setVisibility(0);
      break label729;
      label1562: n = paramBundle.Ux;
      break label774;
      label1571: i2 = paramBundle.Uy;
      break label791;
      label1580: paramBundle = localAlertController.TD;
      break label819;
      label1588: i = 0;
      break label830;
      label1593: j = 0;
      break label838;
      label1599: paramBundle = (Bundle)localObject4;
      if (localObject4 != null)
      {
        paramBundle = (Bundle)localObject4;
        if ((i & 0x1) == 0)
        {
          ((ViewGroup)localObject2).removeView((View)localObject4);
          paramBundle = null;
        }
      }
      localObject4 = localObject1;
      if (localObject1 != null)
      {
        localObject4 = localObject1;
        if ((i & 0x2) == 0)
        {
          ((ViewGroup)localObject2).removeView((View)localObject1);
          localObject4 = null;
        }
      }
      if ((paramBundle != null) || (localObject4 != null))
        if (localAlertController.Tk != null)
        {
          localAlertController.TD.setOnScrollChangeListener(new AlertController.2(localAlertController, paramBundle, (View)localObject4));
          localAlertController.TD.post(new AlertController.3(localAlertController, paramBundle, (View)localObject4));
        }
        else if (localAlertController.mListView != null)
        {
          localAlertController.mListView.setOnScrollListener(new AlertController.4(localAlertController, paramBundle, (View)localObject4));
          localAlertController.mListView.post(new AlertController.5(localAlertController, paramBundle, (View)localObject4));
        }
        else
        {
          if (paramBundle != null)
            ((ViewGroup)localObject2).removeView(paramBundle);
          if (localObject4 != null)
            ((ViewGroup)localObject2).removeView((View)localObject4);
        }
    }
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AlertController localAlertController = this.Uz;
    int i;
    if ((localAlertController.TD != null) && (localAlertController.TD.executeKeyEvent(paramKeyEvent)))
    {
      i = 1;
      if (i == 0)
        break label44;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label44: bool = super.onKeyDown(paramInt, paramKeyEvent);
    }
  }

  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AlertController localAlertController = this.Uz;
    int i;
    if ((localAlertController.TD != null) && (localAlertController.TD.executeKeyEvent(paramKeyEvent)))
    {
      i = 1;
      if (i == 0)
        break label44;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label44: bool = super.onKeyUp(paramInt, paramKeyEvent);
    }
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    this.Uz.setTitle(paramCharSequence);
  }

  public static final class a
  {
    public final AlertController.a UA;
    private final int mTheme;

    public a(Context paramContext)
    {
      this(paramContext, b.j(paramContext, 0));
    }

    private a(Context paramContext, int paramInt)
    {
      this.UA = new AlertController.a(new ContextThemeWrapper(paramContext, b.j(paramContext, paramInt)));
      this.mTheme = paramInt;
    }

    public final b fi()
    {
      b localb = new b(this.UA.mContext, this.mTheme);
      AlertController.a locala = this.UA;
      AlertController localAlertController = localb.Uz;
      Object localObject;
      AlertController.RecycleListView localRecycleListView;
      label253: int j;
      if (locala.TG != null)
      {
        localAlertController.TG = locala.TG;
        if (locala.Tk != null)
        {
          localObject = locala.Tk;
          localAlertController.Tk = ((CharSequence)localObject);
          if (localAlertController.ma != null)
            localAlertController.ma.setText((CharSequence)localObject);
        }
        if ((locala.TV != null) || (locala.TW != null))
          localAlertController.a(-1, locala.TV, locala.TX, null, locala.TW);
        if ((locala.TY != null) || (locala.TZ != null))
          localAlertController.a(-2, locala.TY, locala.Ua, null, locala.TZ);
        if ((locala.Ub != null) || (locala.Uc != null))
          localAlertController.a(-3, locala.Ub, locala.Ud, null, locala.Uc);
        if ((locala.Uh != null) || (locala.PI != null) || (locala.Ei != null))
        {
          localRecycleListView = (AlertController.RecycleListView)locala.mInflater.inflate(localAlertController.TK, null);
          if (!locala.Uk)
            break label647;
          if (locala.PI != null)
            break label623;
          localObject = new AlertController.a.1(locala, locala.mContext, localAlertController.TL, locala.Uh, localRecycleListView);
          localAlertController.Ei = ((ListAdapter)localObject);
          localAlertController.TH = locala.TH;
          if (locala.Ui == null)
            break label756;
          localRecycleListView.setOnItemClickListener(new AlertController.a.3(locala, localAlertController));
          label288: if (locala.Up != null)
            localRecycleListView.setOnItemSelectedListener(locala.Up);
          if (!locala.Ul)
            break label782;
          localRecycleListView.setChoiceMode(1);
          label317: localAlertController.mListView = localRecycleListView;
        }
        if (locala.mView == null)
          break label819;
        if (!locala.Tq)
          break label798;
        localObject = locala.mView;
        int i = locala.Tm;
        j = locala.Tn;
        int k = locala.To;
        int m = locala.Tp;
        localAlertController.mView = ((View)localObject);
        localAlertController.Tl = 0;
        localAlertController.Tq = true;
        localAlertController.Tm = i;
        localAlertController.Tn = j;
        localAlertController.To = k;
        localAlertController.Tp = m;
      }
      while (true)
      {
        localb.setCancelable(this.UA.mCancelable);
        if (this.UA.mCancelable)
          localb.setCanceledOnTouchOutside(true);
        localb.setOnCancelListener(this.UA.Ue);
        localb.setOnDismissListener(this.UA.Uf);
        if (this.UA.Ug != null)
          localb.setOnKeyListener(this.UA.Ug);
        return localb;
        if (locala.IT != null)
          localAlertController.setTitle(locala.IT);
        if (locala.rP != null)
        {
          localObject = locala.rP;
          localAlertController.rP = ((Drawable)localObject);
          localAlertController.TE = 0;
          if (localAlertController.sX != null)
          {
            if (localObject == null)
              break label611;
            localAlertController.sX.setVisibility(0);
            localAlertController.sX.setImageDrawable((Drawable)localObject);
          }
        }
        while (true)
        {
          if (locala.TE != 0)
            localAlertController.setIcon(locala.TE);
          if (locala.TU == 0)
            break;
          j = locala.TU;
          localObject = new TypedValue();
          localAlertController.mContext.getTheme().resolveAttribute(j, (TypedValue)localObject, true);
          localAlertController.setIcon(((TypedValue)localObject).resourceId);
          break;
          label611: localAlertController.sX.setVisibility(8);
        }
        label623: localObject = new AlertController.a.2(locala, locala.mContext, locala.PI, localRecycleListView, localAlertController);
        break label253;
        label647: if (locala.Ul);
        for (j = localAlertController.TM; ; j = localAlertController.TN)
        {
          if (locala.PI == null)
            break label718;
          localObject = new SimpleCursorAdapter(locala.mContext, j, locala.PI, new String[] { locala.Un }, new int[] { 16908308 });
          break;
        }
        label718: if (locala.Ei != null)
        {
          localObject = locala.Ei;
          break label253;
        }
        localObject = new AlertController.c(locala.mContext, j, locala.Uh);
        break label253;
        label756: if (locala.Um == null)
          break label288;
        localRecycleListView.setOnItemClickListener(new AlertController.a.4(locala, localRecycleListView, localAlertController));
        break label288;
        label782: if (!locala.Uk)
          break label317;
        localRecycleListView.setChoiceMode(2);
        break label317;
        label798: localAlertController.mView = locala.mView;
        localAlertController.Tl = 0;
        localAlertController.Tq = false;
        continue;
        label819: if (locala.Tl != 0)
        {
          j = locala.Tl;
          localAlertController.mView = null;
          localAlertController.Tl = j;
          localAlertController.Tq = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.v;
import java.util.List;

public class Preference
  implements Comparable<Preference>
{
  private CharSequence IT;
  private int[] MT;
  private boolean OH;
  protected int ZV;
  private int btQ;
  public int ksd;
  public final Context mContext;
  private Object mDefaultValue;
  private Bundle mExtras;
  public String mKey;
  private CharSequence ppl;
  private ImageView qZa;
  protected Drawable rP;
  private a yCW;
  public b yCX;
  public Preference.c yCY;
  private int yCZ;
  private int yDa;
  int yDb;
  private String yDc;
  boolean yDd;
  private boolean yDe;
  public boolean yDf;
  String yDg;
  private boolean yDh;
  private int yDi;
  private boolean yDj;
  private int yDk;
  public int yDl;
  private boolean yDm;
  private List<Preference> yDn;

  public Preference(Context paramContext)
  {
    this(paramContext, null);
  }

  public Preference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842894);
  }

  public Preference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    AppMethodBeat.i(107255);
    this.MT = new int[] { 2130772053, 2130772050 };
    this.btQ = 2147483647;
    this.yDb = 0;
    this.OH = true;
    this.yDd = true;
    this.yDf = true;
    this.yDh = true;
    this.ksd = -1;
    this.qZa = null;
    this.yDi = 0;
    this.yDj = true;
    this.yDk = 2130970127;
    this.yDm = false;
    this.mContext = paramContext;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.Preference, paramInt, 0);
    paramInt = paramAttributeSet.getIndexCount();
    if (paramInt >= 0)
    {
      int i = paramAttributeSet.getIndex(paramInt);
      if (i == 5)
        this.ZV = paramAttributeSet.getResourceId(i, 0);
      while (true)
      {
        paramInt--;
        break;
        if (i == 6)
        {
          this.yDb = paramAttributeSet.getColor(i, 0);
        }
        else if (i == 7)
        {
          this.mKey = paramAttributeSet.getString(i);
        }
        else if (i == 4)
        {
          this.yCZ = paramAttributeSet.getResourceId(i, 0);
          this.IT = paramAttributeSet.getString(i);
          if (this.yCZ != 0)
            this.IT = paramContext.getString(this.yCZ);
        }
        else if (i == 3)
        {
          this.ppl = paramAttributeSet.getString(i);
          this.yDa = paramAttributeSet.getResourceId(i, 0);
          if (this.yDa != 0)
            this.ppl = paramContext.getString(this.yDa);
        }
        else if (i == 8)
        {
          this.btQ = paramAttributeSet.getInt(i, this.btQ);
        }
        else if (i == 1)
        {
          this.yDc = paramAttributeSet.getString(i);
        }
        else if (i == 14)
        {
          this.yDk = paramAttributeSet.getResourceId(i, this.yDk);
        }
        else if (i == 9)
        {
          this.yDl = paramAttributeSet.getResourceId(i, this.yDl);
        }
        else if (i == 0)
        {
          this.OH = paramAttributeSet.getBoolean(i, true);
        }
        else if (i == 10)
        {
          this.yDd = paramAttributeSet.getBoolean(i, true);
        }
        else if (i == 2)
        {
          this.yDf = paramAttributeSet.getBoolean(i, this.yDf);
        }
        else if (i == 11)
        {
          this.yDg = paramAttributeSet.getString(i);
        }
        else if (i == 12)
        {
          this.mDefaultValue = null;
        }
        else if (i == 13)
        {
          this.yDj = paramAttributeSet.getBoolean(i, this.yDj);
        }
      }
    }
    paramAttributeSet.recycle();
    if (!getClass().getName().startsWith("android.preference"))
      this.yDm = true;
    AppMethodBeat.o(107255);
  }

  private void dAF()
  {
    AppMethodBeat.i(107269);
    if (this.mKey == null)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Preference does not have a key assigned.");
      AppMethodBeat.o(107269);
      throw localIllegalStateException;
    }
    this.yDe = true;
    AppMethodBeat.o(107269);
  }

  private boolean hasKey()
  {
    AppMethodBeat.i(107270);
    boolean bool;
    if (!TextUtils.isEmpty(this.mKey))
    {
      bool = true;
      AppMethodBeat.o(107270);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107270);
    }
  }

  private void notifyDependencyChange(boolean paramBoolean)
  {
    AppMethodBeat.i(107272);
    List localList = this.yDn;
    if (localList == null)
      AppMethodBeat.o(107272);
    while (true)
    {
      return;
      int i = localList.size();
      for (int j = 0; j < i; j++)
        ((Preference)localList.get(j)).qj(paramBoolean);
      AppMethodBeat.o(107272);
    }
  }

  private void qj(boolean paramBoolean)
  {
    AppMethodBeat.i(107273);
    if (this.yDh == paramBoolean)
      if (paramBoolean)
        break label42;
    label42: for (paramBoolean = true; ; paramBoolean = false)
    {
      this.yDh = paramBoolean;
      notifyDependencyChange(shouldDisableDependents());
      notifyChanged();
      AppMethodBeat.o(107273);
      return;
    }
  }

  private boolean shouldDisableDependents()
  {
    AppMethodBeat.i(107274);
    boolean bool;
    if (!isEnabled())
    {
      bool = true;
      AppMethodBeat.o(107274);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107274);
    }
  }

  private void w(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(107260);
    paramView.setEnabled(paramBoolean);
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      for (int i = paramView.getChildCount() - 1; i >= 0; i--)
        w(paramView.getChildAt(i), paramBoolean);
    }
    AppMethodBeat.o(107260);
  }

  public final void NW(int paramInt)
  {
    AppMethodBeat.i(107275);
    this.yDi = paramInt;
    if (this.qZa != null)
      this.qZa.setVisibility(paramInt);
    AppMethodBeat.o(107275);
  }

  public void a(a parama)
  {
    this.yCW = parama;
  }

  protected final boolean callChangeListener(Object paramObject)
  {
    AppMethodBeat.i(107271);
    boolean bool;
    if (this.yCW == null)
    {
      bool = true;
      AppMethodBeat.o(107271);
    }
    while (true)
    {
      return bool;
      bool = this.yCW.a(this, paramObject);
      AppMethodBeat.o(107271);
    }
  }

  public void fa()
  {
    AppMethodBeat.i(107263);
    this.ZV = 2131230765;
    Drawable localDrawable = this.mContext.getResources().getDrawable(2131230765);
    if (((localDrawable == null) && (this.rP != null)) || ((localDrawable != null) && (this.rP != localDrawable)))
    {
      this.rP = localDrawable;
      notifyChanged();
    }
    AppMethodBeat.o(107263);
  }

  public final Context getContext()
  {
    return this.mContext;
  }

  public final Bundle getExtras()
  {
    AppMethodBeat.i(107256);
    if (this.mExtras == null)
      this.mExtras = new Bundle();
    Bundle localBundle = this.mExtras;
    AppMethodBeat.o(107256);
    return localBundle;
  }

  public int getLayoutResource()
  {
    return this.yDk;
  }

  public CharSequence getSummary()
  {
    return this.ppl;
  }

  public CharSequence getTitle()
  {
    return this.IT;
  }

  public View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107257);
    View localView = paramView;
    if (paramView == null)
      localView = onCreateView(paramViewGroup);
    onBindView(localView);
    AppMethodBeat.o(107257);
    return localView;
  }

  public final boolean isEnabled()
  {
    if ((this.OH) && (this.yDh));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void notifyChanged()
  {
  }

  protected void onBindView(View paramView)
  {
    int i = 0;
    AppMethodBeat.i(107259);
    Object localObject = paramView.findViewById(2131821019);
    if (localObject != null)
    {
      ((View)localObject).setMinimumHeight((int)(this.mContext.getResources().getDimensionPixelSize(2131427784) * a.fZ(this.mContext)));
      ab.d("dancy test", "resource:%s, height:%s, scale:%s", new Object[] { this.mContext.getResources(), Integer.valueOf(this.mContext.getResources().getDimensionPixelSize(2131427784)), Float.valueOf(a.fZ(this.mContext)) });
    }
    localObject = (TextView)paramView.findViewById(16908310);
    if (localObject != null)
    {
      CharSequence localCharSequence = getTitle();
      if ((localCharSequence != null) && ((localCharSequence instanceof Spannable)))
      {
        if (((TextView)localObject).isClickable())
          ((TextView)localObject).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView)localObject).setText(localCharSequence);
      }
    }
    else
    {
      localObject = (TextView)paramView.findViewById(16908304);
      if (localObject != null)
      {
        if (TextUtils.isEmpty(getSummary()))
          break label382;
        if (((TextView)localObject).getVisibility() != 0)
          ((TextView)localObject).setVisibility(0);
        ((TextView)localObject).setText(getSummary());
        if (this.ksd != -1)
          ((TextView)localObject).setTextColor(this.ksd);
      }
      label217: localObject = (ImageView)paramView.findViewById(16908294);
      if (localObject != null)
      {
        if ((this.ZV != 0) || (this.rP != null))
        {
          if (this.rP == null)
            this.rP = this.mContext.getResources().getDrawable(this.ZV);
          if (this.rP != null)
          {
            ((ImageView)localObject).setImageDrawable(this.rP);
            if (this.yDb != 0)
              ((ImageView)localObject).getDrawable().setColorFilter(this.yDb, PorterDuff.Mode.SRC_ATOP);
          }
        }
        if (this.rP == null)
          break label400;
      }
    }
    while (true)
    {
      ((ImageView)localObject).setVisibility(i);
      this.qZa = ((ImageView)paramView.findViewById(2131821517));
      if (this.qZa != null)
        this.qZa.setVisibility(this.yDi);
      if (this.yDj)
        w(paramView, isEnabled());
      AppMethodBeat.o(107259);
      return;
      ((TextView)localObject).setMovementMethod(null);
      break;
      label382: if (((TextView)localObject).getVisibility() == 8)
        break label217;
      ((TextView)localObject).setVisibility(8);
      break label217;
      label400: i = 8;
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107258);
    LayoutInflater localLayoutInflater = v.hu(this.mContext);
    paramViewGroup = localLayoutInflater.inflate(this.yDk, paramViewGroup, false);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(16908312);
    if (localViewGroup != null)
    {
      if (this.yDl == 0)
        break label65;
      localLayoutInflater.inflate(this.yDl, localViewGroup);
    }
    while (true)
    {
      AppMethodBeat.o(107258);
      return paramViewGroup;
      label65: localViewGroup.setVisibility(8);
    }
  }

  public final void setEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(107266);
    if (this.OH != paramBoolean)
    {
      this.OH = paramBoolean;
      notifyDependencyChange(shouldDisableDependents());
      notifyChanged();
    }
    AppMethodBeat.o(107266);
  }

  public final void setKey(String paramString)
  {
    AppMethodBeat.i(107268);
    this.mKey = paramString;
    if ((this.yDe) && (!hasKey()))
      dAF();
    AppMethodBeat.o(107268);
  }

  public final void setLayoutResource(int paramInt)
  {
    if (paramInt != this.yDk)
      this.yDm = true;
    this.yDk = paramInt;
  }

  public final void setSelectable(boolean paramBoolean)
  {
    AppMethodBeat.i(107267);
    if (this.yDd != paramBoolean)
    {
      this.yDd = paramBoolean;
      notifyChanged();
    }
    AppMethodBeat.o(107267);
  }

  public void setSummary(int paramInt)
  {
    AppMethodBeat.i(107265);
    setSummary(this.mContext.getString(paramInt));
    AppMethodBeat.o(107265);
  }

  public void setSummary(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(107264);
    if (((paramCharSequence == null) && (this.ppl != null)) || ((paramCharSequence != null) && (!paramCharSequence.equals(this.ppl))))
    {
      this.ppl = paramCharSequence;
      notifyChanged();
    }
    AppMethodBeat.o(107264);
  }

  public void setTitle(int paramInt)
  {
    AppMethodBeat.i(107262);
    setTitle(this.mContext.getString(paramInt));
    this.yCZ = paramInt;
    AppMethodBeat.o(107262);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(107261);
    if (((paramCharSequence == null) && (this.IT != null)) || ((paramCharSequence != null) && (!paramCharSequence.equals(this.IT))))
    {
      this.yCZ = 0;
      this.IT = paramCharSequence;
      notifyChanged();
    }
    AppMethodBeat.o(107261);
  }

  public final void setWidgetLayoutResource(int paramInt)
  {
    if (paramInt != this.yDl)
      this.yDm = true;
    this.yDl = paramInt;
  }

  public String toString()
  {
    AppMethodBeat.i(107276);
    Object localObject = new StringBuilder();
    CharSequence localCharSequence = getTitle();
    if (!TextUtils.isEmpty(localCharSequence))
      ((StringBuilder)localObject).append(localCharSequence).append(' ');
    localCharSequence = getSummary();
    if (!TextUtils.isEmpty(localCharSequence))
      ((StringBuilder)localObject).append(localCharSequence).append(' ');
    if (((StringBuilder)localObject).length() > 0)
      ((StringBuilder)localObject).setLength(((StringBuilder)localObject).length() - 1);
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(107276);
    return localObject;
  }

  public static abstract interface a
  {
    public abstract boolean a(Preference paramPreference, Object paramObject);
  }

  public static abstract interface b
  {
    public abstract boolean car();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.Preference
 * JD-Core Version:    0.6.2
 */
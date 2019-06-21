package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.support.v7.widget.bc;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout
  implements p.a
{
  private TextView TF;
  private boolean aaK;
  private RadioButton aaX;
  private CheckBox aaY;
  private TextView aaZ;
  private ImageView aba;
  private Drawable abb;
  private Context abc;
  private boolean abd;
  private Drawable abe;
  private int abf;
  private j kY;
  private int lN;
  private LayoutInflater mInflater;
  private ImageView sX;

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772232);
  }

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = bc.a(getContext(), paramAttributeSet, a.a.MenuView, paramInt, 0);
    this.abb = paramAttributeSet.getDrawable(5);
    this.lN = paramAttributeSet.getResourceId(1, -1);
    this.abd = paramAttributeSet.getBoolean(7, false);
    this.abc = paramContext;
    this.abe = paramAttributeSet.getDrawable(8);
    paramAttributeSet.atG.recycle();
  }

  private LayoutInflater getInflater()
  {
    if (this.mInflater == null)
      this.mInflater = LayoutInflater.from(getContext());
    return this.mInflater;
  }

  private void gr()
  {
    this.aaX = ((RadioButton)getInflater().inflate(2130968600, this, false));
    addView(this.aaX);
  }

  private void gs()
  {
    this.aaY = ((CheckBox)getInflater().inflate(2130968597, this, false));
    addView(this.aaY);
  }

  private void setShortcut$25d965e(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.kY.gH()));
    char c;
    for (int i = 0; ; i = 8)
    {
      if (i == 0)
      {
        TextView localTextView = this.aaZ;
        c = this.kY.gG();
        if (c != 0)
          break;
        localObject = "";
        localTextView.setText((CharSequence)localObject);
      }
      if (this.aaZ.getVisibility() != i)
        this.aaZ.setVisibility(i);
      return;
    }
    Object localObject = new StringBuilder(j.abW);
    switch (c)
    {
    default:
      ((StringBuilder)localObject).append(c);
    case '\n':
    case '\b':
    case ' ':
    }
    while (true)
    {
      localObject = ((StringBuilder)localObject).toString();
      break;
      ((StringBuilder)localObject).append(j.abX);
      continue;
      ((StringBuilder)localObject).append(j.abY);
      continue;
      ((StringBuilder)localObject).append(j.abZ);
    }
  }

  private void setSubMenuArrowVisible(boolean paramBoolean)
  {
    ImageView localImageView;
    if (this.aba != null)
    {
      localImageView = this.aba;
      if (!paramBoolean)
        break label24;
    }
    label24: for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      return;
    }
  }

  public final void a(j paramj)
  {
    int i = 0;
    this.kY = paramj;
    this.abf = 0;
    if (paramj.isVisible())
    {
      j = 0;
      setVisibility(j);
      setTitle(paramj.a(this));
      setCheckable(paramj.isCheckable());
      if ((!paramj.gH()) || (!this.kY.gH()))
        break label155;
    }
    char c;
    label155: for (int j = i; ; j = 8)
    {
      if (j == 0)
      {
        TextView localTextView = this.aaZ;
        c = this.kY.gG();
        if (c != 0)
          break label161;
        localObject = "";
        localTextView.setText((CharSequence)localObject);
      }
      if (this.aaZ.getVisibility() != j)
        this.aaZ.setVisibility(j);
      setIcon(paramj.getIcon());
      setEnabled(paramj.isEnabled());
      setSubMenuArrowVisible(paramj.hasSubMenu());
      setContentDescription(paramj.getContentDescription());
      return;
      j = 8;
      break;
    }
    label161: Object localObject = new StringBuilder(j.abW);
    switch (c)
    {
    default:
      ((StringBuilder)localObject).append(c);
    case '\n':
    case '\b':
    case ' ':
    }
    while (true)
    {
      localObject = ((StringBuilder)localObject).toString();
      break;
      ((StringBuilder)localObject).append(j.abX);
      continue;
      ((StringBuilder)localObject).append(j.abY);
      continue;
      ((StringBuilder)localObject).append(j.abZ);
    }
  }

  public final boolean br()
  {
    return false;
  }

  public j getItemData()
  {
    return this.kY;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    s.a(this, this.abb);
    this.TF = ((TextView)findViewById(2131820678));
    if (this.lN != -1)
      this.TF.setTextAppearance(this.abc, this.lN);
    this.aaZ = ((TextView)findViewById(2131820933));
    this.aba = ((ImageView)findViewById(2131820935));
    if (this.aba != null)
      this.aba.setImageDrawable(this.abe);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.sX != null) && (this.abd))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.sX.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0))
        localLayoutParams1.width = localLayoutParams.height;
    }
    super.onMeasure(paramInt1, paramInt2);
  }

  public void setCheckable(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.aaX == null) && (this.aaY == null));
    while (true)
    {
      return;
      Object localObject1;
      Object localObject2;
      if (this.kY.gI())
      {
        if (this.aaX == null)
          gr();
        localObject1 = this.aaX;
        localObject2 = this.aaY;
        label50: if (!paramBoolean)
          break label140;
        ((CompoundButton)localObject1).setChecked(this.kY.isChecked());
        if (!paramBoolean)
          break label133;
      }
      label133: for (int i = 0; ; i = 8)
      {
        if (((CompoundButton)localObject1).getVisibility() != i)
          ((CompoundButton)localObject1).setVisibility(i);
        if ((localObject2 == null) || (((CompoundButton)localObject2).getVisibility() == 8))
          break;
        ((CompoundButton)localObject2).setVisibility(8);
        break;
        if (this.aaY == null)
          gs();
        localObject1 = this.aaY;
        localObject2 = this.aaX;
        break label50;
      }
      label140: if (this.aaY != null)
        this.aaY.setVisibility(8);
      if (this.aaX != null)
        this.aaX.setVisibility(8);
    }
  }

  public void setChecked(boolean paramBoolean)
  {
    if (this.kY.gI())
      if (this.aaX == null)
        gr();
    for (Object localObject = this.aaX; ; localObject = this.aaY)
    {
      ((CompoundButton)localObject).setChecked(paramBoolean);
      return;
      if (this.aaY == null)
        gs();
    }
  }

  public void setForceShowIcon(boolean paramBoolean)
  {
    this.aaK = paramBoolean;
    this.abd = paramBoolean;
  }

  public void setIcon(Drawable paramDrawable)
  {
    int i;
    if ((this.kY.lo.abF) || (this.aaK))
    {
      i = 1;
      if ((i != 0) || (this.abd))
        break label39;
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label39: if ((this.sX != null) || (paramDrawable != null) || (this.abd))
      {
        if (this.sX == null)
        {
          this.sX = ((ImageView)getInflater().inflate(2130968598, this, false));
          addView(this.sX, 0);
        }
        if ((paramDrawable != null) || (this.abd))
        {
          ImageView localImageView = this.sX;
          if (i != 0);
          while (true)
          {
            localImageView.setImageDrawable(paramDrawable);
            if (this.sX.getVisibility() == 0)
              break;
            this.sX.setVisibility(0);
            break;
            paramDrawable = null;
          }
        }
        this.sX.setVisibility(8);
      }
    }
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      this.TF.setText(paramCharSequence);
      if (this.TF.getVisibility() != 0)
        this.TF.setVisibility(0);
    }
    while (true)
    {
      return;
      if (this.TF.getVisibility() != 8)
        this.TF.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.ListMenuItemView
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.g;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class BaseActivity extends AppCompatActivity
{
  private int bsz = this.yeY;
  private TextView iUy;
  private TextView jao;
  private ImageView kiE;
  private ActionBar mActionBar;
  private Context mContext;
  private boolean qlP = false;
  private int theme;
  private View yeM;
  private View yeN;
  private int yeO = 0;
  private ImageButton yeP;
  private ImageButton yeQ;
  private TextView yeR;
  private MenuItem yeS;
  private MenuItem yeT;
  private int yeU;
  private int yeV;
  private BaseActivity.c yeW;
  private BaseActivity.a yeX = BaseActivity.a.yfe;
  private int yeY;
  private int yeZ;
  LinkedList<BaseActivity.b> yfa = new LinkedList();

  private void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, BaseActivity.a parama)
  {
    if (this.mActionBar == null)
      return;
    if (paramOnMenuItemClickListener == null)
    {
      this.mActionBar.setDisplayHomeAsUpEnabled(false);
      label20: this.yeX = parama;
      if (this.yeX == BaseActivity.a.yfg)
        this.yeU = 0;
      if (this.yeX != BaseActivity.a.yfe)
        break label134;
      this.yeU = 2130837616;
    }
    while (true)
    {
      if ((this.kiE != null) && (this.yeU != 0))
      {
        dwm();
        this.kiE.setImageResource(this.yeU);
      }
      dwo();
      break;
      this.mActionBar.setDisplayHomeAsUpEnabled(false);
      if (this.yeN == null)
        break label20;
      this.yeN.setVisibility(0);
      this.yeN.setOnClickListener(new BaseActivity.2(this, paramOnMenuItemClickListener));
      break label20;
      label134: if (this.yeX == BaseActivity.a.yff)
        this.yeU = 2130837618;
    }
  }

  private void dwm()
  {
    if (this.kiE == null);
    while (true)
    {
      return;
      this.kiE.setVisibility(0);
    }
  }

  private void dwn()
  {
    if (this.yeW == BaseActivity.c.yfp)
      if (this.yeR != null);
    while (true)
    {
      return;
      if (this.qlP)
      {
        this.yeR.setTextColor(this.mContext.getResources().getColorStateList(2131690780));
      }
      else
      {
        this.yeR.setTextColor(this.mContext.getResources().getColorStateList(2131690723));
        continue;
        if (this.yeW == BaseActivity.c.yfr)
          this.yeV = 2130837615;
        while (true)
        {
          if ((this.yeP == null) || (this.yeV == 0))
            break label170;
          this.yeP.setImageResource(this.yeV);
          if (!this.qlP)
            break label172;
          this.yeP.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
          break;
          if (this.yeW == BaseActivity.c.yfs)
            this.yeV = 2130837619;
          else if (this.yeW == BaseActivity.c.yft)
            this.yeV = 2130837620;
        }
        label170: continue;
        label172: this.yeP.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
      }
    }
  }

  private void dwo()
  {
    if (this.qlP)
      this.kiE.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
    while (true)
    {
      return;
      this.kiE.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i = getApplicationContext().getSharedPreferences("SETTING_COLOR", 0).getInt("APP_THEME_COLOR", -16777216);
    switch (i)
    {
    default:
      setTheme(i);
      setContentView(2130970010);
      this.mContext = this;
      this.mActionBar = getSupportActionBar();
      if (this.mActionBar != null)
      {
        this.mActionBar.setLogo(new ColorDrawable(getResources().getColor(17170445)));
        this.mActionBar.fc();
        this.mActionBar.setDisplayHomeAsUpEnabled(false);
        this.mActionBar.fb();
        this.mActionBar.fd();
        paramBundle = LayoutInflater.from(this).inflate(2130968618, null);
        this.mActionBar.setCustomView(paramBundle);
        if (this.yeO == 0)
          this.yeO = aj.hE(this.mContext);
        this.qlP = ah.Nw(this.yeO);
        this.mActionBar.setBackgroundDrawable(new ColorDrawable(this.yeO));
        this.jao = ((TextView)findViewById(16908308));
        this.iUy = ((TextView)findViewById(16908309));
        this.yeM = findViewById(2131820982);
        this.yeN = findViewById(2131820973);
        this.kiE = ((ImageView)findViewById(2131820974));
        setBackBtn(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            AppMethodBeat.i(112445);
            BaseActivity.this.finish();
            AppMethodBeat.o(112445);
            return true;
          }
        });
      }
      this.yeY = aj.am(this.mContext, 2131427563);
      this.yeZ = aj.am(this.mContext, 2131427849);
      if (Build.VERSION.SDK_INT >= 21)
      {
        if (this.yeO == 0)
          this.yeO = aj.hE(this.mContext);
        paramBundle = getWindow();
        paramBundle.clearFlags(201326592);
        paramBundle.addFlags(-2147483648);
        paramBundle.setStatusBarColor(this.yeO);
        if (Build.VERSION.SDK_INT >= 23)
        {
          paramBundle = getWindow().getDecorView();
          i = paramBundle.getSystemUiVisibility();
          if (!this.qlP)
            break label419;
          i &= -8193;
        }
      }
      break;
    case -16711936:
    case -16777216:
    }
    while (true)
    {
      paramBundle.setSystemUiVisibility(i);
      return;
      this.theme = 2131493738;
      break;
      this.theme = 2131493737;
      break;
      label419: i |= 8192;
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    ai.d("BaseActivity", "on create option menu, menuCache size:%d", new Object[] { Integer.valueOf(this.yfa.size()) });
    int i;
    if ((this.mActionBar == null) || (this.yfa.size() == 0))
    {
      ai.w("BaseActivity", "error, mActionBar is null or cache size:%d", new Object[] { Integer.valueOf(this.yfa.size()) });
      i = 0;
      if (i == 0)
        break label747;
    }
    label307: label489: label747: for (boolean bool = true; ; bool = super.onCreateOptionsMenu(paramMenu))
    {
      return bool;
      Iterator localIterator = this.yfa.iterator();
      while (localIterator.hasNext())
      {
        BaseActivity.b localb = (BaseActivity.b)localIterator.next();
        if (localb.yfi != 16908332)
        {
          if (localb.yfn == BaseActivity.c.yft)
          {
            this.yeS = paramMenu.add(0, localb.yfi, 0, localb.text);
            localObject = new BaseActivity.3(this, localb);
            if (localb.yfm == null)
              localb.yfm = View.inflate(this.mContext, 2130968611, null);
            this.yeQ = ((ImageButton)localb.yfm.findViewById(2131820960));
            this.yeQ.setVisibility(0);
            if (this.yeQ != null)
            {
              if (!this.qlP)
                break label307;
              this.yeQ.setImageResource(2130837627);
            }
            while (true)
            {
              this.yeQ.setOnClickListener((View.OnClickListener)localObject);
              this.yeQ.setEnabled(localb.enable);
              g.a(this.yeS, localb.yfm);
              this.yeS.setEnabled(localb.enable);
              this.yeS.setVisible(localb.aIB);
              break;
              this.yeQ.setImageResource(2130837620);
            }
          }
          this.yeT = paramMenu.add(0, localb.yfi, 0, localb.text);
          BaseActivity.4 local4 = new BaseActivity.4(this, localb);
          Object localObject = new BaseActivity.5(this, localb);
          this.yeW = localb.yfn;
          if ((localb.yfn == BaseActivity.c.yfq) || (localb.yfn == BaseActivity.c.yfp))
          {
            if (localb.yfk == null)
              localb.yfk = View.inflate(this.mContext, 2130968611, null);
            this.yeR = ((TextView)localb.yfk.findViewById(2131820958));
            this.yeR.setVisibility(0);
            this.yeR.setText(localb.text);
            if (localb.yfn == BaseActivity.c.yfq)
            {
              this.yeR.setTextColor(this.mContext.getResources().getColorStateList(2131690724));
              this.yeR.setOnClickListener(local4);
              this.yeR.setOnLongClickListener((View.OnLongClickListener)localObject);
              this.yeR.setEnabled(localb.enable);
              g.a(this.yeT, localb.yfk);
            }
          }
          while (true)
          {
            this.yeT.setEnabled(localb.enable);
            this.yeT.setVisible(localb.aIB);
            if (this.yeT == null)
              break;
            g.a(this.yeT, 2);
            break;
            dwn();
            break label489;
            if (localb.yfj != 0)
              this.yeV = localb.yfj;
            if (localb.yfn == BaseActivity.c.yfu)
              this.yeV = 0;
            if (localb.yfl == null)
              localb.yfl = View.inflate(this.mContext, 2130968611, null);
            this.yeP = ((ImageButton)localb.yfl.findViewById(2131820960));
            dwn();
            if (this.yeV != 0)
            {
              this.yeP.setVisibility(0);
              this.yeP.setOnClickListener(local4);
              this.yeP.setOnLongClickListener((View.OnLongClickListener)localObject);
              this.yeP.setEnabled(localb.enable);
              g.a(this.yeT, localb.yfl);
            }
          }
        }
      }
      if (this.yeS != null)
        g.a(this.yeS, 2);
      i = 1;
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramOnMenuItemClickListener, BaseActivity.a.yfe);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    if ((this.mActionBar == null) || (this.jao == null));
    while (true)
    {
      return;
      this.jao.setText(paramCharSequence.toString());
      if (this.jao != null)
        if (this.qlP)
          this.jao.setTextColor(this.mContext.getResources().getColor(2131689651));
        else
          this.jao.setTextColor(this.mContext.getResources().getColor(2131689650));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.BaseActivity
 * JD-Core Version:    0.6.2
 */
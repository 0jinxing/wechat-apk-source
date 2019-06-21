package com.tencent.mm.plugin.downloader_app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.downloader.c.b.p;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader_app.b.d;
import com.tencent.mm.plugin.downloader_app.b.h;
import com.tencent.mm.plugin.downloader_app.b.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.aj;
import java.util.Iterator;

public class TaskItemView extends LinearLayout
{
  ProgressBar gHA;
  ImageView kPV;
  private ImageView kQA;
  private Button kQB;
  private RelativeLayout kQC;
  private TextView kQD;
  private LinearLayout kQE;
  private TextView kQF;
  private LinearLayout kQG;
  private ImageView kQH;
  private TextView kQI;
  private LinearLayout kQJ;
  private TextView kQK;
  i kQL;
  boolean kQM = false;
  private boolean kQN = false;
  private AppIconView kQv;
  private TextView kQw;
  private TextView kQx;
  private TextView kQy;
  private FrameLayout kQz;

  public TaskItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void H(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(136278);
    float f1 = (float)paramLong2 / 1.073742E+009F;
    float f2 = (float)paramLong2 / 1048576.0F;
    if (paramLong1 >= paramLong2)
      if (f1 >= 1.0F)
      {
        this.kQy.setText(String.format("%.1fGB", new Object[] { Float.valueOf(f1) }));
        AppMethodBeat.o(136278);
      }
    while (true)
    {
      return;
      this.kQy.setText(String.format("%.1fMB", new Object[] { Float.valueOf(f2) }));
      AppMethodBeat.o(136278);
      continue;
      f1 = (float)paramLong1 / 1048576.0F;
      this.kQy.setText(String.format("%.1fMB / %.1fMB", new Object[] { Float.valueOf(f1), Float.valueOf(f2) }));
      post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(136270);
          TaskItemView.h(TaskItemView.this).setSecondaryProgress(100);
          TaskItemView.h(TaskItemView.this).setProgress(this.gOm);
          AppMethodBeat.o(136270);
        }
      });
      AppMethodBeat.o(136278);
    }
  }

  final void biT()
  {
    AppMethodBeat.i(136277);
    ab.d("MicroMsg.TaskItemView", "updateDownloadStatus: %s", new Object[] { this.kQL.appId });
    this.gHA.setIndeterminate(false);
    com.tencent.mm.plugin.downloader.f.a locala = c.In(this.kQL.appId);
    if ((locala == null) || (locala.field_status == 5))
    {
      H(this.kQL.kPc.kKP, this.kQL.kPc.kKP);
      this.kQz.setVisibility(0);
      this.gHA.setIndeterminate(true);
      this.kQA.setVisibility(8);
      this.kQB.setVisibility(8);
      AppMethodBeat.o(136277);
    }
    while (true)
    {
      return;
      H(locala.field_downloadedSize, this.kQL.kPc.kKP);
      if (locala.field_status == 3)
      {
        this.kQz.setVisibility(8);
        this.kQB.setText(2131300623);
        this.kQB.setVisibility(0);
        AppMethodBeat.o(136277);
      }
      else if (locala.field_status == 6)
      {
        this.kQz.setVisibility(8);
        this.kQB.setText(getResources().getString(2131301418));
        this.kQB.setVisibility(0);
        AppMethodBeat.o(136277);
      }
      else
      {
        this.kQz.setVisibility(0);
        this.gHA.setVisibility(0);
        this.kQB.setVisibility(8);
        if (this.kQM)
        {
          this.kQA.setVisibility(8);
          this.gHA.setIndeterminate(true);
          AppMethodBeat.o(136277);
        }
        else if (locala.field_status == 1)
        {
          this.kQM = false;
          this.kQA.setImageResource(2130840420);
          this.kQA.setVisibility(0);
          AppMethodBeat.o(136277);
        }
        else if ((locala.field_reserveInWifi) && (!at.isWifi(getContext())))
        {
          this.kQz.setVisibility(8);
          this.kQB.setText(2131304503);
          this.kQB.setVisibility(0);
          AppMethodBeat.o(136277);
        }
        else if (locala.field_status == 4)
        {
          this.kQz.setVisibility(8);
          this.kQB.setText(2131298932);
          this.kQB.setVisibility(0);
          AppMethodBeat.o(136277);
        }
        else
        {
          this.kQA.setImageResource(2130840419);
          this.kQA.setVisibility(0);
          AppMethodBeat.o(136277);
        }
      }
    }
  }

  public int getNamePaddingLeft()
  {
    AppMethodBeat.i(136279);
    int i;
    if (this.kPV.getVisibility() == 0)
    {
      i = getResources().getDimensionPixelSize(2131428228);
      AppMethodBeat.o(136279);
    }
    while (true)
    {
      return i;
      i = getResources().getDimensionPixelSize(2131428227);
      AppMethodBeat.o(136279);
    }
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(136274);
    super.onAttachedToWindow();
    AppMethodBeat.o(136274);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(136273);
    super.onDetachedFromWindow();
    AppMethodBeat.o(136273);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(136272);
    super.onFinishInflate();
    this.kPV = ((ImageView)findViewById(2131823256));
    this.kQv = ((AppIconView)findViewById(2131820915));
    this.kQw = ((TextView)findViewById(2131823322));
    this.kQx = ((TextView)findViewById(2131823323));
    this.kQy = ((TextView)findViewById(2131823324));
    this.kQz = ((FrameLayout)findViewById(2131823325));
    this.gHA = ((ProgressBar)findViewById(2131821099));
    this.gHA.setOnClickListener(new TaskItemView.1(this));
    this.gHA.setSecondaryProgress(100);
    this.kQA = ((ImageView)findViewById(2131823326));
    this.kQA.setOnClickListener(new TaskItemView.3(this));
    this.kQB = ((Button)findViewById(2131823327));
    this.kQB.setOnClickListener(new TaskItemView.4(this));
    this.kQC = ((RelativeLayout)findViewById(2131823328));
    this.kQD = ((TextView)findViewById(2131823330));
    this.kQE = ((LinearLayout)findViewById(2131823331));
    this.kQF = ((TextView)findViewById(2131823332));
    this.kQF.getViewTreeObserver().addOnGlobalLayoutListener(new TaskItemView.5(this));
    this.kQE.setOnClickListener(new TaskItemView.6(this));
    this.kQF.setOnClickListener(new TaskItemView.7(this));
    this.kQG = ((LinearLayout)findViewById(2131823333));
    this.kQH = ((ImageView)findViewById(2131823334));
    this.kQI = ((TextView)findViewById(2131823335));
    this.kQJ = ((LinearLayout)findViewById(2131823336));
    this.kQJ.setOnClickListener(new TaskItemView.8(this));
    this.kQK = ((TextView)findViewById(2131823337));
    AppMethodBeat.o(136272);
  }

  public void setData(i parami)
  {
    AppMethodBeat.i(136276);
    this.kQL = parami;
    if (parami == null)
    {
      setVisibility(8);
      AppMethodBeat.o(136276);
    }
    while (true)
    {
      return;
      setVisibility(0);
      this.kQz.setVisibility(8);
      this.kQB.setVisibility(8);
      this.kQC.setVisibility(8);
      this.kQG.setVisibility(8);
      new c.a().ePH = true;
      o.ahp().a(this.kQL.iconUrl, this.kQv);
      this.kQw.setText(this.kQL.appName);
      parami = c.In(this.kQL.appId);
      if ((parami != null) && (parami.field_autoDownload))
        this.kQx.setVisibility(0);
      while (true)
      {
        if (!this.kQL.kci)
          break label242;
        if (this.kPV.getVisibility() != 0)
        {
          this.kPV.setVisibility(0);
          this.kPV.startAnimation(AnimationUtils.loadAnimation(getContext(), 2131034244));
        }
        setSelected(this.kQL.gBF);
        H(this.kQL.kPc.kKP, this.kQL.kPc.kKP);
        AppMethodBeat.o(136276);
        break;
        this.kQx.setVisibility(8);
      }
      label242: this.kPV.setVisibility(8);
      if (this.kQL.kPe != null)
      {
        parami = (LinearLayout.LayoutParams)this.kQG.getLayoutParams();
        if (this.kQL.kci)
        {
          parami.leftMargin = aj.fromDPToPix(getContext(), 114);
          label295: this.kQG.setLayoutParams(parami);
          this.kQG.setVisibility(0);
          new c.a().ePH = true;
          o.ahp().a(this.kQL.kPe.cIY, this.kQH);
          if (this.kQL.kPe.kKL != null)
            this.kQI.setText(this.kQL.kPe.kKL.value);
        }
      }
      try
      {
        this.kQI.setTextColor(Color.parseColor(this.kQL.kPe.kKL.color));
        label398: if (this.kQL.kPe.kKM != null)
        {
          this.kQJ.setVisibility(0);
          this.kQK.setText(this.kQL.kPe.kKM.value);
        }
        try
        {
          this.kQK.setTextColor(Color.parseColor(this.kQL.kPe.kKM.color));
          label462: if (!this.kQL.kOZ)
          {
            this.kQL.kOZ = true;
            com.tencent.mm.plugin.downloader_app.c.a.a(10, 1006, this.kQL.position, 1, this.kQL.appId, "", "");
          }
          while (true)
          {
            H(this.kQL.kPc.kKP, this.kQL.kPc.kKP);
            if (this.kQL.type != 4)
              break label716;
            parami = c.In(this.kQL.appId);
            if ((parami != null) && (parami.field_status != 0) && (parami.field_status != 5))
              break label703;
            this.kQz.setVisibility(8);
            this.kQB.setVisibility(0);
            this.kQB.setText(getContext().getResources().getString(2131304173));
            if (bo.isNullOrNil(this.kQL.kPa))
              break label707;
            this.kQC.setVisibility(0);
            this.kQD.setText(this.kQL.kPa);
            this.kQD.setMaxLines(2);
            AppMethodBeat.o(136276);
            break;
            parami.leftMargin = aj.fromDPToPix(getContext(), 78);
            break label295;
            this.kQJ.setVisibility(8);
            break label462;
            this.kQG.setVisibility(8);
          }
          label703: biT();
          label707: AppMethodBeat.o(136276);
          continue;
          label716: if (this.kQL.type == 6)
          {
            this.kQz.setVisibility(8);
            this.kQB.setVisibility(0);
            this.kQB.setText(getContext().getResources().getString(2131300935));
            AppMethodBeat.o(136276);
            continue;
          }
          biT();
          AppMethodBeat.o(136276);
        }
        catch (Exception parami)
        {
          break label462;
        }
      }
      catch (Exception parami)
      {
        break label398;
      }
    }
  }

  public void setSelected(boolean paramBoolean)
  {
    AppMethodBeat.i(136275);
    ab.d("MicroMsg.TaskItemView", "setSelected selected: %b, appid: %s", new Object[] { Boolean.valueOf(paramBoolean), this.kQL.appId });
    this.kQL.gBF = paramBoolean;
    Object localObject;
    h localh;
    int i;
    if (paramBoolean)
    {
      this.kPV.setImageResource(2130838331);
      localObject = getParent();
      if (localObject == null)
        break label237;
      if (!(localObject instanceof TaskListView))
        break label227;
      localObject = (TaskListView)localObject;
      localh = ((TaskListView)localObject).kQZ.kQR;
      Iterator localIterator = localh.iterator();
      i = 0;
      label95: if (!localIterator.hasNext())
        break label152;
      i locali = (i)localIterator.next();
      if ((!locali.biN()) || (!locali.gBF))
        break label246;
      i++;
    }
    label152: label159: label207: label218: label227: label237: label246: 
    while (true)
    {
      break label95;
      this.kPV.setImageResource(2130838332);
      break;
      if (i > 0)
      {
        paramBoolean = true;
        d.gf(paramBoolean);
        if (i != localh.size() - 3)
          break label207;
        if (!(((TaskListView)localObject).getContext() instanceof DownloadMainUI))
          break label218;
        ((DownloadMainUI)((TaskListView)localObject).getContext()).gj(true);
        AppMethodBeat.o(136275);
      }
      while (true)
      {
        return;
        paramBoolean = false;
        break label159;
        ((DownloadMainUI)((TaskListView)localObject).getContext()).gj(false);
        AppMethodBeat.o(136275);
        continue;
        localObject = ((ViewParent)localObject).getParent();
        break;
        AppMethodBeat.o(136275);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskItemView
 * JD-Core Version:    0.6.2
 */
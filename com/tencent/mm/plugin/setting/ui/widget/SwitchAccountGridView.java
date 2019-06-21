package com.tencent.mm.plugin.setting.ui.widget;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.plugin.setting.model.SwitchAccountModel;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SwitchAccountGridView extends GridLayout
{
  private static int qqY;
  private String gCZ;
  private boolean qqZ;
  private boolean qra;
  private boolean qrb;
  public String qrc;
  public boolean qrd;
  public AnimatorSet qre;
  public List<String> qrf;
  public List<SwitchAccountGridView.d> qrg;
  public List<View> qrh;
  private SwitchAccountGridView.b qri;
  private SwitchAccountGridView.a qrj;
  private SwitchAccountGridView.c qrk;

  public SwitchAccountGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(127708);
    this.qrf = new ArrayList();
    this.qrg = new ArrayList();
    this.qrh = new ArrayList();
    qqY = getResources().getDimensionPixelOffset(2131427501) * 2;
    AppMethodBeat.o(127708);
  }

  public final void ab(Map<String, SwitchAccountModel> paramMap)
  {
    AppMethodBeat.i(127709);
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      this.qrf.addAll(paramMap.keySet());
      Collections.sort(this.qrf);
    }
    ab.i("MicroMsg.SwitchAccountGridView", "account count %d", new Object[] { Integer.valueOf(this.qrf.size()) });
    int i = 0;
    while (true)
      if (i < this.qrf.size())
      {
        localObject1 = ((Activity)getContext()).getLayoutInflater().inflate(2130970645, null);
        ImageView localImageView = (ImageView)((View)localObject1).findViewById(2131827435);
        localObject2 = (ImageView)((View)localObject1).findViewById(2131827436);
        Object localObject3 = ((View)localObject1).findViewById(2131827438);
        String str = (String)this.qrf.get(i);
        localObject4 = (TextView)((View)localObject1).findViewById(2131827437);
        localObject5 = new SwitchAccountGridView.d(this, (byte)0);
        ((SwitchAccountGridView.d)localObject5).goC = localImageView;
        ((SwitchAccountGridView.d)localObject5).qpr = ((ImageView)localObject2);
        ((SwitchAccountGridView.d)localObject5).nmj = ((TextView)localObject4);
        ((SwitchAccountGridView.d)localObject5).qro = ((View)localObject3);
        localImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        localObject3 = ((SwitchAccountModel)paramMap.get(str)).mnu;
        try
        {
          if (!bo.isNullOrNil((String)localObject3))
          {
            if (!this.qrb)
              break label372;
            ab.i("MicroMsg.SwitchAccountGridView", "use system decoder!");
            localObject3 = e.e((String)localObject3, 0, (int)e.asZ((String)localObject3));
            if (localObject3 != null)
            {
              localObject3 = BitmapFactory.decodeByteArray((byte[])localObject3, 0, localObject3.length);
              if (localObject3 != null)
                localImageView.setImageBitmap((Bitmap)localObject3);
            }
          }
          while (true)
          {
            ((TextView)localObject4).setText(j.b(getContext(), ((SwitchAccountModel)paramMap.get(str)).username, ((TextView)localObject4).getTextSize()));
            localImageView.setOnClickListener(new SwitchAccountGridView.1(this, str));
            ((ImageView)localObject2).setOnClickListener(new SwitchAccountGridView.2(this, str));
            this.qrg.add(localObject5);
            this.qrh.add(localObject1);
            i++;
            break;
            label372: localObject3 = d.qi((String)localObject3);
            if (localObject3 == null)
              break label413;
            localImageView.setImageBitmap((Bitmap)localObject3);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.SwitchAccountGridView", localException, "get avatar error", new Object[0]);
            continue;
            label413: a.b.b(((SwitchAccountGridView.d)localObject5).goC, str);
          }
        }
      }
    Object localObject5 = ((Activity)getContext()).getLayoutInflater().inflate(2130970645, null);
    Object localObject1 = (ImageView)((View)localObject5).findViewById(2131827435);
    Object localObject4 = (ImageView)((View)localObject5).findViewById(2131827436);
    paramMap = (TextView)((View)localObject5).findViewById(2131827437);
    Object localObject2 = new SwitchAccountGridView.d(this, (byte)0);
    ((SwitchAccountGridView.d)localObject2).goC = ((ImageView)localObject1);
    ((SwitchAccountGridView.d)localObject2).qpr = ((ImageView)localObject4);
    ((SwitchAccountGridView.d)localObject2).nmj = paramMap;
    ((ImageView)localObject1).setScaleType(ImageView.ScaleType.FIT_XY);
    ((ImageView)localObject1).setImageResource(2130837886);
    paramMap.setText(getContext().getResources().getString(2131303286));
    ((ImageView)localObject1).setOnClickListener(new SwitchAccountGridView.3(this));
    this.qrg.add(localObject2);
    this.qrh.add(localObject5);
    AppMethodBeat.o(127709);
  }

  public final void cjt()
  {
    AppMethodBeat.i(127710);
    if (this.qrd)
    {
      ab.i("MicroMsg.SwitchAccountGridView", "playing animation");
      AppMethodBeat.o(127710);
    }
    while (true)
    {
      return;
      removeAllViews();
      int i = Math.min(2, this.qrf.size());
      int j = 0;
      label103: GridLayout.LayoutParams localLayoutParams;
      if (j < i)
      {
        if ((this.qqZ) && (!((String)this.qrf.get(j)).equals(this.gCZ)))
        {
          ((SwitchAccountGridView.d)this.qrg.get(j)).qpr.setVisibility(0);
          ((SwitchAccountGridView.d)this.qrg.get(j)).qro.setVisibility(4);
          if ((!bo.isNullOrNil(this.gCZ)) && (((String)this.qrf.get(j)).equals(this.gCZ)))
          {
            if (!this.qra)
              break label524;
            ((ImageView)((SwitchAccountGridView.d)this.qrg.get(j)).qro.findViewById(2131827440)).setImageResource(2130839013);
            label194: if (!this.qra)
              break label558;
            ((TextView)((SwitchAccountGridView.d)this.qrg.get(j)).qro.findViewById(2131827442)).setText(getContext().getResources().getString(2131305734));
          }
        }
        while (true)
        {
          ((SwitchAccountGridView.d)this.qrg.get(j)).qro.findViewById(2131827441).setVisibility(8);
          ((SwitchAccountGridView.d)this.qrg.get(j)).qro.findViewById(2131827440).setVisibility(0);
          ((SwitchAccountGridView.d)this.qrg.get(j)).qro.setVisibility(0);
          if ((!bo.isNullOrNil(this.qrc)) && (((String)this.qrf.get(j)).equals(this.qrc)))
          {
            ((TextView)((SwitchAccountGridView.d)this.qrg.get(j)).qro.findViewById(2131827442)).setText(getContext().getResources().getString(2131301031));
            ((SwitchAccountGridView.d)this.qrg.get(j)).qro.findViewById(2131827440).setVisibility(8);
            ((SwitchAccountGridView.d)this.qrg.get(j)).qro.findViewById(2131827441).setVisibility(0);
            ((SwitchAccountGridView.d)this.qrg.get(j)).qro.setVisibility(0);
          }
          localLayoutParams = new GridLayout.LayoutParams();
          localLayoutParams.width = qqY;
          addView((View)this.qrh.get(j), localLayoutParams);
          j++;
          break;
          ((SwitchAccountGridView.d)this.qrg.get(j)).qpr.setVisibility(4);
          break label103;
          label524: ((ImageView)((SwitchAccountGridView.d)this.qrg.get(j)).qro.findViewById(2131827440)).setImageResource(2130839011);
          break label194;
          label558: ((TextView)((SwitchAccountGridView.d)this.qrg.get(j)).qro.findViewById(2131827442)).setText(getContext().getResources().getString(2131303289));
        }
      }
      if (getChildCount() < 2)
      {
        ((SwitchAccountGridView.d)this.qrg.get(this.qrg.size() - 1)).qpr.setVisibility(4);
        localLayoutParams = new GridLayout.LayoutParams();
        localLayoutParams.width = qqY;
        addView((View)this.qrh.get(this.qrh.size() - 1), localLayoutParams);
      }
      AppMethodBeat.o(127710);
    }
  }

  public int getAccountCount()
  {
    AppMethodBeat.i(127711);
    int i = this.qrf.size();
    AppMethodBeat.o(127711);
    return i;
  }

  public void setDeleteState(boolean paramBoolean)
  {
    this.qqZ = paramBoolean;
  }

  public void setLastLoginWxUsername(String paramString)
  {
    this.gCZ = paramString;
  }

  public void setLogoutState(boolean paramBoolean)
  {
    this.qra = paramBoolean;
  }

  public void setOnAnimatorEndListener(SwitchAccountGridView.a parama)
  {
    this.qrj = parama;
  }

  public void setOnClickAvatarListener(SwitchAccountGridView.b paramb)
  {
    this.qri = paramb;
  }

  public void setOnDeleteAvatarListener(SwitchAccountGridView.c paramc)
  {
    this.qrk = paramc;
  }

  public void setSwitchToWxUsername(String paramString)
  {
    this.qrc = paramString;
  }

  public void setUseSystemDecoder(boolean paramBoolean)
  {
    this.qrb = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView
 * JD-Core Version:    0.6.2
 */
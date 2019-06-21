package com.tencent.mm.plugin.sns.ui.album;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.data.SnsCmdList;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import java.util.Iterator;
import java.util.List;

public class SnsAlbumUI extends MMFragment
  implements h.a, a.a
{
  private RecyclerView aiB;
  private String igi;
  private am.a rCU;
  private Runnable rCZ;
  private LinearLayout rFJ;
  private LinearLayout rFK;
  private a rFL;
  private int rFM;
  private String ryC;
  private int ryE;
  private boolean ryx;

  public SnsAlbumUI()
  {
    AppMethodBeat.i(39992);
    this.aiB = null;
    this.rFJ = null;
    this.rFK = null;
    this.rFL = null;
    this.ryC = null;
    this.igi = null;
    this.ryE = 0;
    this.ryx = false;
    this.rCU = null;
    this.rFM = 0;
    this.rCZ = new SnsAlbumUI.1(this);
    AppMethodBeat.o(39992);
  }

  private boolean cuT()
  {
    if (this.rFM < 3);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void a(boolean paramBoolean1, String paramString1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong, String paramString2)
  {
    AppMethodBeat.i(39997);
    af.bCo().removeCallbacks(this.rCZ);
    if ((this.ryC.equals(this.igi)) && (paramLong != 0L))
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xQk, Long.valueOf(paramLong));
      this.rFL.kI(paramLong);
    }
    if (paramBoolean1)
    {
      this.rFL.cuS();
      AppMethodBeat.o(39997);
    }
    while (true)
    {
      return;
      if (cuT())
      {
        this.rFM += 1;
        this.rCU.b(2, this.igi, true, this.ryE);
        AppMethodBeat.o(39997);
      }
      else
      {
        if (this.rFL != null)
        {
          this.rFM = 0;
          this.rFL.rFj = paramBoolean2;
          this.rFL.rFh = paramString1;
          this.rFL.ctK();
          this.rFL.ll(true);
        }
        AppMethodBeat.o(39997);
      }
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong, String paramString2)
  {
    AppMethodBeat.i(39996);
    if ((this.ryC.equals(this.igi)) && (paramLong != 0L))
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xQk, Long.valueOf(paramLong));
      this.rFL.kI(paramLong);
    }
    if (paramBoolean2)
      this.rFL.cuS();
    while (true)
    {
      if ((bo.isNullOrNil(this.rFL.rFi)) && (this.rFL != null))
      {
        this.rFL.rFh = paramString1;
        this.rFL.ctK();
        this.rFL.ll(true);
      }
      AppMethodBeat.o(39996);
      return;
      if ((paramBoolean1) || (cuT()))
      {
        this.rFM += 1;
        this.rCU.b(2, this.igi, true, this.ryE);
      }
    }
  }

  public void dealContentView(View paramView)
  {
    AppMethodBeat.i(39993);
    super.dealContentView(paramView);
    this.rCU = af.cnv();
    this.ryE = getActivity().getIntent().getIntExtra("sns_source", 0);
    this.igi = getActivity().getIntent().getStringExtra("sns_userName");
    this.ryC = r.Yz();
    this.rFL = new a(getContext(), this.igi, this);
    this.rFL.rFq = new SnsAlbumUI.3(this);
    this.rFJ = ((LinearLayout)paramView.findViewById(2131827672));
    this.rFK = ((LinearLayout)paramView.findViewById(2131827674));
    this.aiB = ((RecyclerView)paramView.findViewById(2131827675));
    this.rFK.setOnClickListener(new SnsAlbumUI.4(this));
    this.aiB.setAdapter(this.rFL);
    paramView = this.aiB;
    getContext();
    paramView.setLayoutManager(new LinearLayoutManager());
    this.aiB.a(new SnsAlbumUI.5(this));
    this.aiB.postDelayed(new SnsAlbumUI.6(this), 500L);
    AppMethodBeat.o(39993);
  }

  public final void du(List<a.b> paramList)
  {
    AppMethodBeat.i(39999);
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      this.aiB.setVisibility(0);
      this.rFJ.setVisibility(8);
      AppMethodBeat.o(39999);
    }
    while (true)
    {
      return;
      this.aiB.setVisibility(8);
      this.rFJ.setVisibility(0);
      AppMethodBeat.o(39999);
    }
  }

  public int getLayoutId()
  {
    return 2130970743;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(40000);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.d("MicroMsg.SnsAlbumUI", "onActivityResult result=%s request=%s intent=%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramIntent });
    Iterator localIterator;
    if ((paramInt1 == 8) && (paramIntent != null) && (paramIntent.getParcelableExtra("sns_cmd_list") != null) && ((paramIntent.getParcelableExtra("sns_cmd_list") instanceof SnsCmdList)))
      localIterator = ((SnsCmdList)paramIntent.getParcelableExtra("sns_cmd_list")).qFN.iterator();
    label135: label418: label421: 
    while (true)
    {
      if (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        paramIntent = this.rFL;
        RecyclerView localRecyclerView = this.aiB;
        paramInt1 = 0;
        Object localObject;
        label201: int j;
        int k;
        label240: int m;
        int n;
        if (paramInt1 < paramIntent.rFg.size())
        {
          localObject = ((a.b)paramIntent.rFg.get(paramInt1)).rFt.iterator();
          while (true)
            if (((Iterator)localObject).hasNext())
              if (i == ((n)((Iterator)localObject).next()).reX)
              {
                paramInt2 = paramInt1;
                if (paramInt2 == -1)
                  break label320;
                localObject = localRecyclerView.cf(paramInt2);
                if (!(localObject instanceof a.f))
                  break;
                localObject = a.f.a((a.f)localObject);
                j = -1;
                k = 1;
                paramInt1 = 0;
                if (paramInt1 >= ((c)localObject).rFD.size())
                  break label335;
                m = j;
                n = k;
                if (((a.d)((c)localObject).rFD.get(paramInt1)).cNE == i)
                {
                  if (j != -1)
                    break label322;
                  m = paramInt1;
                  n = k;
                }
              }
        }
        while (true)
        {
          paramInt1++;
          j = m;
          k = n;
          break label240;
          paramInt1++;
          break label135;
          paramInt2 = -1;
          break label201;
          label320: break;
          label322: n = k + 1;
          m = j;
        }
        label335: if (j == -1)
          break label418;
        for (paramInt1 = 0; paramInt1 < k; paramInt1++)
          ((c)localObject).rFD.remove(j);
        paramInt1 = ((c)localObject).rFD.size();
        ((c)localObject).au(j, k);
      }
      while (true)
      {
        if (paramInt1 > 0)
          break label421;
        paramIntent.rFg.remove(paramInt2);
        paramIntent.ci(paramInt2);
        break;
        AppMethodBeat.o(40000);
        return;
        paramInt1 = 0;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39994);
    super.onCreate(paramBundle);
    setMMTitle(2131296502);
    setBackBtn(new SnsAlbumUI.2(this));
    AppMethodBeat.o(39994);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39998);
    super.onDestroy();
    this.ryx = true;
    af.bCo().removeCallbacks(this.rCZ);
    g.RQ();
    if ((g.RN().QY()) && (this.rCU != null))
      this.rCU.a(this, 2);
    AppMethodBeat.o(39998);
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    AppMethodBeat.i(39995);
    ab.d("MicroMsg.SnsAlbumUI", "onViewCreated");
    super.onViewCreated(paramView, paramBundle);
    AppMethodBeat.o(39995);
  }

  public boolean supportNavigationSwipeBack()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI
 * JD-Core Version:    0.6.2
 */
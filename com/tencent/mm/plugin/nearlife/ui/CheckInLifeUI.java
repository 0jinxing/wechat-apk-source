package com.tencent.mm.plugin.nearlife.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.protocal.protobuf.axw;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;

public class CheckInLifeUI extends BaseLifeUI
  implements f
{
  String color;
  private String dud;
  private View.OnClickListener nij;
  private boolean oRT;
  private String oSd;
  private b oSj;
  private b oSk;
  private ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> oSl;
  private c oSm;
  private axw oSn;
  private View.OnClickListener oSo;
  private c.a oSp;

  public CheckInLifeUI()
  {
    AppMethodBeat.i(22956);
    this.oSm = null;
    this.dud = "";
    this.oSd = "";
    this.oRT = false;
    this.nij = new CheckInLifeUI.1(this);
    this.oSo = new CheckInLifeUI.2(this);
    this.oSp = new CheckInLifeUI.3(this);
    AppMethodBeat.o(22956);
  }

  private static ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> M(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(22965);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      paramArrayList = null;
      AppMethodBeat.o(22965);
    }
    while (true)
    {
      return paramArrayList;
      ArrayList localArrayList = new ArrayList();
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        String[] arrayOfString = ((String)paramArrayList.next()).split("\n");
        if (2 == arrayOfString.length)
          try
          {
            BackwardSupportUtil.ExifHelper.LatLongData localLatLongData = new com/tencent/mm/sdk/platformtools/BackwardSupportUtil$ExifHelper$LatLongData;
            localLatLongData.<init>(Float.valueOf(arrayOfString[0]).floatValue(), Float.valueOf(arrayOfString[1]).floatValue());
            localArrayList.add(localLatLongData);
          }
          catch (NumberFormatException localNumberFormatException)
          {
          }
      }
      ab.i("MicroMsg.CheckInLifeUI", "parse list end, size: " + localArrayList.size());
      AppMethodBeat.o(22965);
      paramArrayList = localArrayList;
    }
  }

  public final a bVm()
  {
    AppMethodBeat.i(22962);
    if (this.oSl == null)
      this.oSl = M(getIntent().getStringArrayListExtra("lat_long_list"));
    if (getIntent().getStringExtra("select_radio_icon_color") != null)
      this.color = getIntent().getStringExtra("select_radio_icon_color");
    if ((getIntent().getStringExtra("select_radio_icon_color") != null) && (getIntent().getStringExtra("get_poi_from_scene").equals("story")))
    {
      this.oRT = true;
      this.oRT = true;
    }
    Object localObject;
    if (this.oSj == null)
    {
      this.oSj = new b(this, this.nij, "viewlist", this.oRU, false, this.color);
      if ((this.oSl != null) && (this.oSl.size() != 0))
      {
        localObject = new ArrayList();
        ((ArrayList)localObject).add(this.oSl.get(this.oSl.size() - 1));
        this.oSj.L((ArrayList)localObject);
        this.oSj.oRu = false;
      }
      localObject = this.oSj;
      AppMethodBeat.o(22962);
    }
    while (true)
    {
      return localObject;
      localObject = this.oSj;
      AppMethodBeat.o(22962);
    }
  }

  public final a bVn()
  {
    AppMethodBeat.i(22963);
    if (this.oSl == null)
      this.oSl = M(getIntent().getStringArrayListExtra("lat_long_list"));
    b localb;
    if (this.oSk == null)
    {
      this.oSk = new b(this, this.oSo, "searchlist", this.oRU, true, this.color);
      this.oSk.L(this.oSl);
      this.oSk.oRu = true;
      localb = this.oSk;
      AppMethodBeat.o(22963);
    }
    while (true)
    {
      return localb;
      localb = this.oSk;
      AppMethodBeat.o(22963);
    }
  }

  public final void bVo()
  {
    AppMethodBeat.i(22958);
    super.bVo();
    AppMethodBeat.o(22958);
  }

  public final int getLayoutId()
  {
    return 2130970285;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22957);
    super.onCreate(paramBundle);
    setMMTitle(2131301605);
    this.oSm = c.agw();
    this.oSn = new axw();
    this.oSd = getIntent().getStringExtra("get_poi_classify_id");
    try
    {
      this.oSn = ((axw)this.oSn.parseFrom(getIntent().getByteArrayExtra("get_poi_item_buf")));
      if (this.oSn != null)
        this.oSd = this.oSn.oQU;
      if (bo.isNullOrNil(this.oSd))
        this.dud = getIntent().getStringExtra("get_city");
      if (!bo.isNullOrNil(this.dud))
        this.oSd = this.oSj.fs(this.dud, "").oQU;
      this.oSj.oSd = this.oSd;
      if ((this.oSn != null) && (!bo.isNullOrNil(this.oSn.oQU)))
      {
        localb = this.oSj;
        paramBundle = new com.tencent.mm.plugin.nearlife.b.a("", this.oSn);
        if (localb.oSb == null)
        {
          localb.a(paramBundle, 1);
          AppMethodBeat.o(22957);
          return;
        }
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        b localb;
        ab.printErrStackTrace("MicroMsg.CheckInLifeUI", paramBundle, "", new Object[0]);
        this.oSn = null;
        continue;
        localb.a(paramBundle, 2);
        AppMethodBeat.o(22957);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22960);
    super.onDestroy();
    if (this.oSm != null)
      this.oSm.a(this.oSp);
    AppMethodBeat.o(22960);
  }

  public void onPause()
  {
    AppMethodBeat.i(22961);
    super.onPause();
    AppMethodBeat.o(22961);
  }

  public void onResume()
  {
    AppMethodBeat.i(22959);
    super.onResume();
    AppMethodBeat.o(22959);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void p(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(22964);
    ab.i("MicroMsg.CheckInLifeUI", "checkinLife got address %f %f", new Object[] { Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) });
    if ((this.oSm != null) && (bo.isNullOrNil(this.dud)))
      this.oSm.a(paramDouble1, paramDouble2, this.oSp);
    AppMethodBeat.o(22964);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI
 * JD-Core Version:    0.6.2
 */
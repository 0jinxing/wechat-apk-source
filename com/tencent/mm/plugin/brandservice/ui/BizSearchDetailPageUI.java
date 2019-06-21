package com.tencent.mm.plugin.brandservice.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.mh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.ui.tools.o.b;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BizSearchDetailPageUI extends MMActivity
  implements o.b
{
  private int Lp;
  private int emC;
  private o jKT;
  private BizSearchResultItemContainer jKU;
  private long jKV;
  private String jKW;
  private int jKX;
  private Runnable jKY;

  public BizSearchDetailPageUI()
  {
    AppMethodBeat.i(13879);
    this.jKY = new BizSearchDetailPageUI.1(this);
    AppMethodBeat.o(13879);
  }

  public final void apo()
  {
    AppMethodBeat.i(13885);
    finish();
    AppMethodBeat.o(13885);
  }

  public final void app()
  {
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  public final int getLayoutId()
  {
    return 2130968855;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13880);
    super.onCreate(paramBundle);
    setBackBtn(new BizSearchDetailPageUI.2(this));
    paramBundle = getIntent();
    this.jKV = paramBundle.getLongExtra("businessType", 0L);
    boolean bool1 = paramBundle.getBooleanExtra("showEditText", false);
    this.emC = paramBundle.getIntExtra("fromScene", 0);
    this.jKX = paramBundle.getIntExtra("addContactScene", 35);
    Object localObject1 = paramBundle.getStringExtra("title");
    String str = paramBundle.getStringExtra("keyword");
    boolean bool2 = paramBundle.getBooleanExtra("showCatalog", false);
    this.Lp = paramBundle.getIntExtra("offset", 0);
    if ((this.jKV == 0L) || (bo.isNullOrNil(str)))
    {
      ab.e("MicroMsg.BrandService.BizSearchDetailPageUI", "businessType(%d) or queryStr is nil.", new Object[] { Long.valueOf(this.jKV) });
      finish();
      AppMethodBeat.o(13880);
      return;
    }
    paramBundle = paramBundle.getByteArrayExtra("result");
    int i = 0;
    int j = 0;
    if (paramBundle != null);
    while (true)
    {
      Object localObject2;
      try
      {
        localObject2 = new com/tencent/mm/protocal/protobuf/mh;
        ((mh)localObject2).<init>();
        paramBundle = (mh)((mh)localObject2).parseFrom(paramBundle);
        if (paramBundle != null)
          j = 1;
        this.jKU = ((BizSearchResultItemContainer)findViewById(2131821800));
        this.jKU.setAdapter(new c(this));
        this.jKU.setBusinessTypes(new long[] { this.jKV });
        this.jKU.setMode(1);
        this.jKU.setDisplayArgs$25decb5(bool2);
        this.jKU.setScene(this.emC);
        this.jKU.setAddContactScene(this.jKX);
        this.jKU.setReporter(new BizSearchDetailPageUI.3(this));
        if (!bool1)
          break label433;
        this.jKT = new o();
        a(this.jKT);
        this.jKT.qQ(false);
        this.jKT.clearFocus();
        this.jKT.setSearchContent(str);
        this.jKT.zHa = this;
        this.jKU.setOnTouchListener(new BizSearchDetailPageUI.4(this));
        if (j == 0)
          break label567;
        localObject1 = this.jKU;
        j = this.Lp;
        ((BizSearchResultItemContainer)localObject1).reset();
        if (paramBundle != null)
          break label448;
        ab.e("MicroMsg.BrandService.BizSearchResultItemContainer", "setFirst page content failed, content is null.");
        AppMethodBeat.o(13880);
      }
      catch (IOException paramBundle)
      {
        ab.printErrStackTrace("MicroMsg.BrandService.BizSearchDetailPageUI", paramBundle, "", new Object[0]);
        finish();
        AppMethodBeat.o(13880);
      }
      break;
      label433: if (!bo.isNullOrNil((String)localObject1))
      {
        setMMTitle((String)localObject1);
        continue;
        label448: ((BizSearchResultItemContainer)localObject1).jLp.ctj = str;
        ((BizSearchResultItemContainer)localObject1).setBusinessTypes(new long[] { paramBundle.vQd });
        ((BizSearchResultItemContainer)localObject1).jLp.jLh = paramBundle.vQe;
        ((BizSearchResultItemContainer)localObject1).jLu = j;
        localObject2 = new LinkedList();
        ((List)localObject2).add(paramBundle);
        ((BizSearchResultItemContainer)localObject1).jLn.h(str, (List)localObject2);
        ((BizSearchResultItemContainer)localObject1).jLp.offset = (j + paramBundle.vOq);
        paramBundle = ((BizSearchResultItemContainer)localObject1).jLp;
        if (!((BizSearchResultItemContainer)localObject1).jLn.isEmpty());
        for (bool1 = true; ; bool1 = false)
        {
          paramBundle.jLD = bool1;
          AppMethodBeat.o(13880);
          break;
        }
        label567: vO(str);
        AppMethodBeat.o(13880);
        break;
        paramBundle = null;
        j = i;
      }
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(13881);
    if (this.jKT != null)
      this.jKT.a(this, paramMenu);
    AppMethodBeat.o(13881);
    return true;
  }

  public void onPause()
  {
    AppMethodBeat.i(13883);
    super.onPause();
    if (this.jKT != null)
      this.jKT.clearFocus();
    AppMethodBeat.o(13883);
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(13882);
    if (this.jKT != null)
      this.jKT.a(this, paramMenu);
    AppMethodBeat.o(13882);
    return true;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final boolean vN(String paramString)
  {
    return false;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(13884);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(13884);
    while (true)
    {
      return;
      paramString = paramString.trim();
      if (!paramString.equals(this.jKW))
      {
        al.af(this.jKY);
        this.jKW = paramString;
        al.n(this.jKY, 400L);
      }
      AppMethodBeat.o(13884);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI
 * JD-Core Version:    0.6.2
 */
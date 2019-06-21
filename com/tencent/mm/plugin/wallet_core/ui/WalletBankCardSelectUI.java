package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.model.t;
import com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView;
import com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView.a;
import com.tencent.mm.plugin.wallet_core.utils.a;
import com.tencent.mm.plugin.wallet_core.utils.a.8;
import com.tencent.mm.plugin.wallet_core.utils.a.9;
import com.tencent.mm.plugin.wallet_core.utils.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.sortview.d;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WalletBankCardSelectUI extends WalletBaseUI
{
  private o jKT;
  private boolean jLD = false;
  private BankCardSelectSortView tEc;
  private List<ElementQuery> tEd;
  private List<d> tEe;

  private void al(Map<String, e> paramMap)
  {
    AppMethodBeat.i(47151);
    boolean bool;
    if (paramMap != null)
    {
      bool = true;
      ab.d("WalletBankCardSelectUI", "refresh data: %s", new Object[] { Boolean.valueOf(bool) });
      this.tEe.clear();
      if ((this.tEd != null) && (!this.tEd.isEmpty()))
        break label75;
      ab.w("WalletBankCardSelectUI", "bankcardlist is null");
      AppMethodBeat.o(47151);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label75: Iterator localIterator = this.tEd.iterator();
      if (localIterator.hasNext())
      {
        Object localObject1 = (ElementQuery)localIterator.next();
        Object localObject2 = this.tEe.iterator();
        Object localObject3;
        int i;
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (BankCardSelectSortView.a)((d)((Iterator)localObject2).next()).data;
          if (((ElementQuery)localObject1).nuL.equals(((BankCardSelectSortView.a)localObject3).pcj))
          {
            i = 1;
            label163: if (i != 0)
              break label337;
            localObject3 = new d();
            localObject2 = new BankCardSelectSortView.a();
            ((BankCardSelectSortView.a)localObject2).pcj = ((ElementQuery)localObject1).nuL;
            if (paramMap != null)
            {
              localObject1 = (e)paramMap.get(((ElementQuery)localObject1).pbn);
              if (localObject1 != null)
              {
                ((BankCardSelectSortView.a)localObject2).cIY = ((e)localObject1).oRi;
                ((BankCardSelectSortView.a)localObject2).tNi = ((e)localObject1).txr;
                ((BankCardSelectSortView.a)localObject2).puh = ((e)localObject1).puh;
              }
            }
            if (bo.isNullOrNil(((BankCardSelectSortView.a)localObject2).puh))
              break label339;
            ab.d("WalletBankCardSelectUI", "have pinyin：%s", new Object[] { ((BankCardSelectSortView.a)localObject2).puh });
          }
        }
        while (true)
        {
          ((d)localObject3).yDG = ((BankCardSelectSortView.a)localObject2).puh.toUpperCase().charAt(0);
          ((d)localObject3).data = localObject2;
          this.tEe.add(localObject3);
          break;
          i = 0;
          break label163;
          label337: break;
          label339: ((BankCardSelectSortView.a)localObject2).puh = ap(((BankCardSelectSortView.a)localObject2).pcj, "#", "_");
        }
      }
      Collections.sort(this.tEe, new WalletBankCardSelectUI.a((byte)0));
      runOnUiThread(new WalletBankCardSelectUI.4(this));
      AppMethodBeat.o(47151);
    }
  }

  public static String ap(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(47152);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(47152);
    while (true)
    {
      return paramString2;
      StringBuilder localStringBuilder = new StringBuilder();
      int i = paramString1.length();
      for (int j = 0; j < i; j++)
      {
        String str = SpellMap.r(paramString1.charAt(j));
        if (!bo.isNullOrNil(str))
        {
          localStringBuilder.append(str.toUpperCase());
          if (j != i - 1)
            localStringBuilder.append(paramString3);
        }
      }
      paramString1 = localStringBuilder.toString();
      ab.d("WalletBankCardSelectUI", "full py: %s", new Object[] { paramString1 });
      if (!bo.isNullOrNil(paramString1))
      {
        AppMethodBeat.o(47152);
        paramString2 = paramString1;
      }
      else
      {
        AppMethodBeat.o(47152);
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130971067;
  }

  public final void initView()
  {
    AppMethodBeat.i(47150);
    this.tEc = ((BankCardSelectSortView)findViewById(2131828697));
    this.tEc.setOnItemClickListener(new WalletBankCardSelectUI.1(this));
    this.jKT = new o((byte)0);
    this.jKT.zHa = new WalletBankCardSelectUI.2(this);
    AppMethodBeat.o(47150);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47149);
    super.onCreate(paramBundle);
    setMMTitle(2131297479);
    this.tEd = r.cPQ().tum;
    initView();
    this.tEe = new ArrayList();
    al(null);
    paramBundle = new a();
    Object localObject1 = r.cPQ().tum;
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = ((List)localObject1).iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (ElementQuery)localIterator.next();
      localObject2 = new Bankcard();
      ((Bankcard)localObject2).field_bankName = ((ElementQuery)localObject1).nuL;
      ((Bankcard)localObject2).field_bankcardType = ((ElementQuery)localObject1).pbn;
      localLinkedList.add(localObject2);
    }
    Object localObject2 = new WalletBankCardSelectUI.3(this);
    localObject1 = new HashMap();
    if (localLinkedList.isEmpty())
    {
      ab.w("MicroMsg.BankcardLogoHelper", "req is null");
      ((a.a)localObject2).am((Map)localObject1);
    }
    while (true)
    {
      a(this.jKT);
      AppMethodBeat.o(47149);
      return;
      f.cU(localLinkedList).d(new a.9(paramBundle)).d(new a.8(paramBundle, localLinkedList, (Map)localObject1, (a.a)localObject2));
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI
 * JD-Core Version:    0.6.2
 */
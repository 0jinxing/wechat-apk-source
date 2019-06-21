package com.tencent.mm.plugin.wallet_core.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.ui.e.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ak
{
  public int mRetryCount;
  private ArrayList<Bankcard> tCR;
  private ArrayList<Bankcard> tCS;
  public aj tCT;
  public Bankcard tCU;
  public ai tCV;
  public n tCW;
  public b tCX;
  private List<c> tCY;
  public Bankcard tCZ;
  public long tDa;
  long tDb;
  public long tDc;
  private String tDd;
  public int tDe;
  public String tDf;
  public String tDg;
  int tgW;
  int tgX;
  public Bankcard thy;
  private ArrayList<Bankcard> tlM;
  private ArrayList<Bankcard> tlN;

  public ak()
  {
    AppMethodBeat.i(46964);
    this.tCR = new ArrayList();
    this.tCS = new ArrayList();
    this.tlM = new ArrayList();
    this.tlN = new ArrayList();
    this.tCT = null;
    this.tCU = null;
    this.thy = null;
    this.tCV = null;
    this.tCW = null;
    this.tCX = null;
    this.tCY = new LinkedList();
    this.tCZ = null;
    this.tgW = 0;
    this.tgX = 0;
    this.tDa = bo.anT();
    this.tDb = 0L;
    this.tDc = -1L;
    this.tDd = "";
    this.tDe = 10000;
    this.mRetryCount = 0;
    this.tDf = "";
    this.tDg = "";
    cQv();
    AppMethodBeat.o(46964);
  }

  public static void acD(String paramString)
  {
    AppMethodBeat.i(46992);
    if (!bo.isNullOrNil(paramString))
    {
      g.RQ();
      g.RP().Ry().set(196612, paramString);
    }
    AppMethodBeat.o(46992);
  }

  private static void acE(String paramString)
  {
    AppMethodBeat.i(46997);
    if (paramString != null)
    {
      g.RQ();
      g.RP().Ry().set(196633, paramString);
    }
    AppMethodBeat.o(46997);
  }

  public static void acF(String paramString)
  {
    AppMethodBeat.i(47000);
    ab.i("MicroMsg.WalletUserInfoManger", "setSelectBindSerial %s %s", new Object[] { paramString, bo.dpG().toString() });
    acE(paramString);
    AppMethodBeat.o(47000);
  }

  @Deprecated
  private Bankcard b(ArrayList<Bankcard> paramArrayList, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(46995);
    Object localObject = paramArrayList;
    if (paramArrayList == null)
      localObject = this.tlM;
    paramArrayList = paramString;
    if (bo.isNullOrNil(paramString))
      paramArrayList = cQK();
    if ((paramBoolean1) && (this.thy != null))
      if (cQh())
      {
        paramArrayList = this.thy;
        AppMethodBeat.o(46995);
      }
    while (true)
    {
      return paramArrayList;
      if ((paramArrayList != null) && (paramArrayList.equals(this.thy.field_bindSerial)))
      {
        paramArrayList = this.thy;
        AppMethodBeat.o(46995);
      }
      else if ((this.tCZ != null) && (this.tCT != null) && (this.tCT.field_lqt_state == 1) && (paramArrayList != null) && (paramArrayList.equals(this.tCZ.field_bindSerial)))
      {
        paramArrayList = this.tCZ;
        AppMethodBeat.o(46995);
      }
      else if ((!cQi()) && ((localObject == null) || (((ArrayList)localObject).size() == 0)))
      {
        paramArrayList = this.thy;
        AppMethodBeat.o(46995);
      }
      else if ((localObject == null) || (((ArrayList)localObject).size() <= 0))
      {
        ab.e("MicroMsg.WalletUserInfoManger", "not found bankcard!");
        AppMethodBeat.o(46995);
        paramArrayList = null;
      }
      else if ((((ArrayList)localObject).size() == 1) && (paramBoolean2))
      {
        ab.e("MicroMsg.WalletUserInfoManger", "only one bankcard!");
        paramArrayList = (Bankcard)((ArrayList)localObject).get(0);
        AppMethodBeat.o(46995);
      }
      else
      {
        ab.i("MicroMsg.WalletUserInfoManger", "have multiple bankcards!");
        if (!bo.isNullOrNil(paramArrayList))
        {
          Iterator localIterator1 = ((ArrayList)localObject).iterator();
          do
          {
            Iterator localIterator2;
            while (!localIterator2.hasNext())
            {
              do
              {
                if (!localIterator1.hasNext())
                  break;
                paramString = (Bankcard)localIterator1.next();
              }
              while ((paramString == null) || (!paramArrayList.equals(paramString.field_bindSerial)));
              if ((!paramBoolean3) || (!paramString.cPg()))
                break label395;
              ab.i("MicroMsg.WalletUserInfoManger", "default card is honeypay");
              if ((paramBoolean1) && (this.thy != null))
              {
                paramArrayList = this.thy;
                AppMethodBeat.o(46995);
                break;
              }
              localIterator2 = ((ArrayList)localObject).iterator();
            }
            paramString = (Bankcard)localIterator2.next();
          }
          while (paramString.cPg());
          AppMethodBeat.o(46995);
          paramArrayList = paramString;
          continue;
          label395: AppMethodBeat.o(46995);
          paramArrayList = paramString;
        }
        else if (paramBoolean2)
        {
          paramArrayList = (Bankcard)((ArrayList)localObject).get(0);
          AppMethodBeat.o(46995);
        }
        else
        {
          AppMethodBeat.o(46995);
          paramArrayList = null;
        }
      }
    }
  }

  private boolean cQH()
  {
    AppMethodBeat.i(46985);
    boolean bool;
    if (((this.tCV != null) && (this.tCV.cPW())) || ((this.tlN != null) && (this.tlN.size() > 0)))
    {
      bool = true;
      AppMethodBeat.o(46985);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46985);
    }
  }

  private static String cQK()
  {
    AppMethodBeat.i(46991);
    g.RQ();
    String str = (String)g.RP().Ry().get(196612, null);
    AppMethodBeat.o(46991);
    return str;
  }

  private void cQQ()
  {
    AppMethodBeat.i(46999);
    ab.i("MicroMsg.WalletUserInfoManger", "recordDataState()");
    if (this.tCT == null)
      ab.i("MicroMsg.WalletUserInfoManger", "userInfo == null");
    if (this.tlM == null)
    {
      ab.i("MicroMsg.WalletUserInfoManger", "bankcards == null");
      if (this.tlN != null)
        break label163;
      ab.i("MicroMsg.WalletUserInfoManger", "virtualBankcards == null");
      label59: if (this.thy != null)
        break label215;
      ab.i("MicroMsg.WalletUserInfoManger", "balance == null");
      label74: if (this.tCU != null)
        break label226;
      ab.i("MicroMsg.WalletUserInfoManger", "historyBankcard == null");
      label89: if (this.tCW != null)
        break label237;
      ab.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo == null");
      AppMethodBeat.o(46999);
    }
    while (true)
    {
      return;
      if (this.tlM.size() == 0)
      {
        ab.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == 0");
        break;
      }
      ab.i("MicroMsg.WalletUserInfoManger", "bankcards.size() == " + this.tlM.size());
      break;
      label163: if (this.tlN.size() == 0)
      {
        ab.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == 0");
        break label59;
      }
      ab.i("MicroMsg.WalletUserInfoManger", "virtualBankcards.size() == " + this.tlN.size());
      break label59;
      label215: ab.i("MicroMsg.WalletUserInfoManger", "balance != null");
      break label74;
      label226: ab.i("MicroMsg.WalletUserInfoManger", "historyBankcard != null");
      break label89;
      label237: ab.i("MicroMsg.WalletUserInfoManger", "mLoanEntryInfo != null");
      AppMethodBeat.o(46999);
    }
  }

  public static Bankcard cQR()
  {
    AppMethodBeat.i(47001);
    Bankcard localBankcard = r.cPI().a(null, null, true, true);
    if (localBankcard == null)
      ab.e("MicroMsg.WalletUserInfoManger", "defaultBankcards == null");
    AppMethodBeat.o(47001);
    return localBankcard;
  }

  private static boolean dR(List<Bankcard> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(46987);
    if (paramList.size() == 0)
      AppMethodBeat.o(46987);
    while (true)
    {
      return bool;
      g.RQ();
      Object localObject = (String)g.RP().Ry().get(196659, null);
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        AppMethodBeat.o(46987);
        bool = true;
      }
      else
      {
        localObject = ((String)localObject).split("&");
        if ((localObject == null) || (localObject.length == 0))
        {
          AppMethodBeat.o(46987);
          bool = true;
        }
        else
        {
          int i = 0;
          int j = 0;
          if (i < localObject.length)
          {
            CharSequence localCharSequence = localObject[i];
            int k = j;
            if (!TextUtils.isEmpty(localCharSequence));
            for (int m = 0; ; m++)
            {
              k = j;
              if (m < paramList.size())
              {
                Bankcard localBankcard = (Bankcard)paramList.get(m);
                if ((localBankcard != null) && (localCharSequence.equals(localBankcard.field_bankcardType)))
                  k = j + 1;
              }
              else
              {
                i++;
                j = k;
                break;
              }
            }
          }
          if (j < paramList.size())
          {
            AppMethodBeat.o(46987);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(46987);
          }
        }
      }
    }
  }

  public final void Km()
  {
    AppMethodBeat.i(46975);
    if (this.tCT != null)
    {
      this.tCT.field_is_reg = -1;
      this.tCT = null;
    }
    if (this.tCV != null)
      this.tCV = null;
    if (this.thy != null)
      this.thy = null;
    if (this.tlM != null)
    {
      this.tlM.clear();
      this.tlM = null;
    }
    if (this.tlN != null)
    {
      this.tlN.clear();
      this.tlN = null;
    }
    this.tDb = 0L;
    com.tencent.mm.wallet_core.ui.e.a(new e.c[] { new e.c("wallet_balance_version", Integer.valueOf(-1)), new e.c("wallet_balance_last_update_time", Integer.valueOf(-1)), new e.c("wallet_balance", Integer.valueOf(-1)) });
    this.tDa = bo.anT();
    AppMethodBeat.o(46975);
  }

  @Deprecated
  public final Bankcard a(ArrayList<Bankcard> paramArrayList, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(46993);
    paramArrayList = a(paramArrayList, paramString, paramBoolean1, paramBoolean2, false);
    AppMethodBeat.o(46993);
    return paramArrayList;
  }

  public final Bankcard a(ArrayList<Bankcard> paramArrayList, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(46994);
    paramArrayList = b(paramArrayList, paramString, paramBoolean1, paramBoolean2, paramBoolean3);
    AppMethodBeat.o(46994);
    return paramArrayList;
  }

  public final void a(aj paramaj)
  {
    AppMethodBeat.i(46990);
    this.tCT = paramaj;
    r.cPE().apM();
    r.cPE().b(paramaj);
    AppMethodBeat.o(46990);
  }

  public final void a(aj paramaj, ArrayList<Bankcard> paramArrayList1, ArrayList<Bankcard> paramArrayList2, Bankcard paramBankcard1, Bankcard paramBankcard2, n paramn, b paramb, Bankcard paramBankcard3, int paramInt1, int paramInt2, List<c> paramList)
  {
    AppMethodBeat.i(46989);
    ab.i("MicroMsg.WalletUserInfoManger", "setBankcards scene %d", new Object[] { Integer.valueOf(paramInt2) });
    if (paramInt2 == 8)
      this.tCR = paramArrayList1;
    if ((paramInt2 == 24) || (paramInt2 == 25))
      this.tCS = paramArrayList1;
    this.tCY = paramList;
    this.tlM = paramArrayList1;
    this.tlN = paramArrayList2;
    this.thy = paramBankcard1;
    this.tCV = new ai(paramaj.field_switchConfig, paramaj.field_wallet_entrance_balance_switch_state);
    this.tCU = paramBankcard2;
    this.tCW = paramn;
    this.tCX = paramb;
    this.tCZ = paramBankcard3;
    ab.i("MicroMsg.WalletUserInfoManger", "setBankcards()! " + paramaj.field_switchConfig);
    cQQ();
    int i = paramInt1;
    if (paramInt1 < 0)
      i = 600;
    this.tDa = (bo.anT() + i);
    this.tDb = (bo.anT() + 600L);
    ab.i("MicroMsg.WalletUserInfoManger", "hy: cache time: %d, dead time: %d, cacheDeadTime: %s", new Object[] { Integer.valueOf(i), Long.valueOf(this.tDa), Long.valueOf(this.tDb) });
    r.cPG().apM();
    if ((paramInt2 != 24) && (paramInt2 != 25) && (paramArrayList1 != null))
      r.cPG().dU(paramArrayList1);
    if (paramArrayList2 != null)
      r.cPG().dU(paramArrayList2);
    if (paramBankcard1 != null)
      r.cPG().f(paramBankcard1);
    if (paramBankcard2 != null)
      r.cPG().f(paramBankcard2);
    if (paramBankcard3 != null)
      r.cPG().f(paramBankcard3);
    a(paramaj);
    r.cPK().apM();
    if (paramn != null)
      r.cPK().b(paramn);
    AppMethodBeat.o(46989);
  }

  public final boolean acC(String paramString)
  {
    AppMethodBeat.i(46988);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(46988);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject1;
      Object localObject2;
      if (this.tlM != null)
      {
        localObject1 = this.tlM.iterator();
        while (true)
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (Bankcard)((Iterator)localObject1).next();
            if ((paramString.equals(((Bankcard)localObject2).field_bankcardType)) && (((Bankcard)localObject2).cPb()))
            {
              AppMethodBeat.o(46988);
              bool = false;
              break;
            }
          }
      }
      if (this.tlN != null)
      {
        localObject2 = this.tlN.iterator();
        while (true)
          if (((Iterator)localObject2).hasNext())
          {
            localObject1 = (Bankcard)((Iterator)localObject2).next();
            if ((paramString.equals(((Bankcard)localObject1).field_bankcardType)) && (((Bankcard)localObject1).field_bankcardState == 0))
            {
              AppMethodBeat.o(46988);
              bool = false;
              break;
            }
          }
      }
      bool = true;
      AppMethodBeat.o(46988);
    }
  }

  public final String bhp()
  {
    if (this.tCT != null);
    for (String str = this.tCT.field_true_name; ; str = null)
      return str;
  }

  public final boolean cQA()
  {
    boolean bool = true;
    if (this.tCT != null)
      if (this.tCT.field_paymenu_use_new != 1);
    while (true)
    {
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }

  public final ArrayList<Bankcard> cQB()
  {
    AppMethodBeat.i(46976);
    if ((this.tlM == null) || (this.tlM.size() <= 0))
      this.tlM = r.cPG().cQB();
    Object localObject;
    if ((this.tlM == null) || (this.tlM.size() <= 0))
    {
      localObject = null;
      AppMethodBeat.o(46976);
    }
    while (true)
    {
      return localObject;
      localObject = new ArrayList();
      Iterator localIterator = this.tlM.iterator();
      while (localIterator.hasNext())
        ((ArrayList)localObject).add((Bankcard)localIterator.next());
      AppMethodBeat.o(46976);
    }
  }

  public final List<c> cQC()
  {
    AppMethodBeat.i(46977);
    Object localObject;
    if ((this.tCY == null) || (this.tCY.size() <= 0))
    {
      localObject = null;
      AppMethodBeat.o(46977);
    }
    while (true)
    {
      return localObject;
      localObject = this.tCY;
      AppMethodBeat.o(46977);
    }
  }

  public final ArrayList<Bankcard> cQD()
  {
    AppMethodBeat.i(46978);
    Object localObject;
    if ((this.tlM == null) || (this.tlM.size() <= 0))
    {
      localObject = null;
      AppMethodBeat.o(46978);
    }
    while (true)
    {
      return localObject;
      localObject = new ArrayList();
      Iterator localIterator = this.tlM.iterator();
      while (localIterator.hasNext())
      {
        Bankcard localBankcard = (Bankcard)localIterator.next();
        if ((!localBankcard.cPe()) && (!localBankcard.cPg()))
          ((ArrayList)localObject).add(localBankcard);
      }
      AppMethodBeat.o(46978);
    }
  }

  public final ArrayList<Bankcard> cQE()
  {
    AppMethodBeat.i(46981);
    ArrayList localArrayList = new ArrayList();
    if ((this.thy != null) && (!cQi()))
      localArrayList.add(this.thy);
    if ((this.tCZ != null) && (!cQi()))
      localArrayList.add(this.tCZ);
    Iterator localIterator;
    if ((this.tCR != null) && (this.tlM != null) && (this.tCR.size() == this.tlM.size()) && (this.tCR.size() > 0))
      localIterator = this.tCR.iterator();
    while (localIterator.hasNext())
    {
      localArrayList.add((Bankcard)localIterator.next());
      continue;
      if ((this.tlM != null) && (this.tlM.size() > 0))
      {
        localIterator = this.tlM.iterator();
        while (localIterator.hasNext())
          localArrayList.add((Bankcard)localIterator.next());
      }
    }
    AppMethodBeat.o(46981);
    return localArrayList;
  }

  public final ArrayList<Bankcard> cQF()
  {
    AppMethodBeat.i(46982);
    ArrayList localArrayList = new ArrayList();
    if ((this.thy != null) && (!cQi()))
      localArrayList.add(this.thy);
    if ((this.tCS != null) && (this.tlM != null) && (this.tCS.size() > 0))
    {
      Iterator localIterator = this.tCS.iterator();
      while (localIterator.hasNext())
      {
        Bankcard localBankcard = (Bankcard)localIterator.next();
        if (!localBankcard.cPg())
          localArrayList.add(localBankcard);
      }
    }
    AppMethodBeat.o(46982);
    return localArrayList;
  }

  public final boolean cQG()
  {
    boolean bool = false;
    AppMethodBeat.i(46984);
    if (cQH())
      AppMethodBeat.o(46984);
    while (true)
    {
      return bool;
      if ((this.tlM != null) && (this.tlM.size() > 0))
      {
        AppMethodBeat.o(46984);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(46984);
      }
    }
  }

  public final boolean cQI()
  {
    AppMethodBeat.i(46986);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    f(localArrayList1, localArrayList2);
    boolean bool;
    if (dR(localArrayList2))
    {
      bool = true;
      AppMethodBeat.o(46986);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46986);
    }
  }

  public final int cQJ()
  {
    if (this.tDe > 0);
    for (int i = this.tDe; ; i = 10000)
      return i;
  }

  public final String cQL()
  {
    String str = null;
    AppMethodBeat.i(46996);
    if ((this.tlM == null) || (this.tlM.size() <= 0))
    {
      ab.e("MicroMsg.WalletUserInfoManger", "not found bankcard!");
      AppMethodBeat.o(46996);
    }
    while (true)
    {
      return str;
      Iterator localIterator = this.tlM.iterator();
      if (localIterator.hasNext())
      {
        str = ((Bankcard)localIterator.next()).field_bindSerial;
        AppMethodBeat.o(46996);
      }
      else
      {
        AppMethodBeat.o(46996);
      }
    }
  }

  public final boolean cQM()
  {
    AppMethodBeat.i(46998);
    long l = bo.fp(this.tDc);
    ab.d("MicroMsg.WalletUserInfoManger", "pass time ".concat(String.valueOf(l)));
    boolean bool;
    if (l > 300L)
    {
      bool = true;
      AppMethodBeat.o(46998);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46998);
    }
  }

  public final int cQN()
  {
    if (this.tCT != null);
    for (int i = this.tCT.field_lqt_cell_is_show; ; i = 0)
      return i;
  }

  public final String cQO()
  {
    if (this.tCT != null);
    for (String str = this.tCT.field_lqt_cell_lqt_title; ; str = null)
      return str;
  }

  public final String cQP()
  {
    if (this.tCT != null);
    for (String str = this.tCT.field_lqt_cell_lqt_wording; ; str = null)
      return str;
  }

  public final boolean cQg()
  {
    AppMethodBeat.i(46966);
    boolean bool;
    if ((this.tCT != null) && (this.tCT.cQg()))
    {
      bool = true;
      AppMethodBeat.o(46966);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46966);
    }
  }

  public final boolean cQh()
  {
    AppMethodBeat.i(46968);
    boolean bool;
    if ((this.tCT != null) && (this.tCT.cQh()))
    {
      bool = true;
      AppMethodBeat.o(46968);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46968);
    }
  }

  public final boolean cQi()
  {
    AppMethodBeat.i(46967);
    boolean bool;
    if ((this.tCT != null) && (this.tCT.cQi()))
    {
      bool = true;
      AppMethodBeat.o(46967);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46967);
    }
  }

  public final boolean cQk()
  {
    AppMethodBeat.i(46969);
    boolean bool;
    if ((this.tCT != null) && (this.tCT.cQk()))
    {
      bool = true;
      AppMethodBeat.o(46969);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46969);
    }
  }

  public final boolean cQl()
  {
    AppMethodBeat.i(46965);
    boolean bool;
    if ((this.tCT == null) || ((this.tCT != null) && (this.tCT.cQj())))
    {
      bool = true;
      AppMethodBeat.o(46965);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46965);
    }
  }

  public final int cQm()
  {
    if (this.tCT != null);
    for (int i = this.tCT.field_soter_pay_open_type; ; i = 0)
      return i;
  }

  public final String cQn()
  {
    if (this.tCT != null);
    for (String str = this.tCT.field_ftf_pay_url; ; str = null)
      return str;
  }

  public final ai cQo()
  {
    AppMethodBeat.i(46971);
    ai localai;
    if (this.tCV == null)
    {
      localai = new ai();
      AppMethodBeat.o(46971);
    }
    while (true)
    {
      return localai;
      localai = this.tCV;
      AppMethodBeat.o(46971);
    }
  }

  public final boolean cQp()
  {
    if ((this.tCT != null) && (this.tCT.field_isDomesticUser));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int cQq()
  {
    if (this.tCT != null);
    for (int i = this.tCT.field_cre_type; ; i = 1)
      return i;
  }

  public final String cQr()
  {
    if (this.tCT != null);
    for (String str = this.tCT.field_cre_name; ; str = "")
      return str;
  }

  public final String cQs()
  {
    AppMethodBeat.i(46972);
    g.RQ();
    String str = (String)g.RP().Ry().get(ac.a.xTe, null);
    if (!bo.isNullOrNil(str))
      AppMethodBeat.o(46972);
    while (true)
    {
      return str;
      if (this.tCT != null)
      {
        str = this.tCT.field_lct_wording;
        AppMethodBeat.o(46972);
      }
      else
      {
        AppMethodBeat.o(46972);
        str = null;
      }
    }
  }

  public final String cQt()
  {
    if (this.tCT != null);
    for (String str = this.tCT.field_lct_url; ; str = null)
      return str;
  }

  public final String cQu()
  {
    if (this.tCT != null);
    for (String str = this.tCT.field_forget_passwd_url; ; str = "")
      return str;
  }

  public final void cQv()
  {
    AppMethodBeat.i(46973);
    if (!g.RN().QY())
    {
      ab.w("MicroMsg.WalletUserInfoManger", "Account Not Ready!");
      AppMethodBeat.o(46973);
    }
    while (true)
    {
      return;
      this.tCT = r.cPE().cRh();
      if (this.tCT != null)
      {
        this.tCV = new ai(this.tCT.field_switchConfig, this.tCT.field_wallet_entrance_balance_switch_state);
        if (bo.isNullOrNil(this.tCT.field_bank_priority));
      }
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(this.tCT.field_bank_priority);
        this.tCY = af.aE(localJSONObject);
        this.thy = r.cPG().cRc();
        this.tCZ = r.cPG().cRd();
        com.tencent.mm.wallet_core.ui.e.a("wallet_balance", new ak.1(this));
        this.tlM = r.cPG().cQB();
        this.tlN = r.cPG().cRe();
        this.tCU = r.cPG().cRf();
        this.tCW = r.cPK().cQZ();
        ab.i("MicroMsg.WalletUserInfoManger", "loadDbData!");
        cQQ();
        AppMethodBeat.o(46973);
        continue;
        this.tCV = new ai();
      }
      catch (JSONException localJSONException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WalletUserInfoManger", localJSONException, "", new Object[0]);
      }
    }
  }

  public final boolean cQw()
  {
    AppMethodBeat.i(46974);
    boolean bool;
    if (ae.gjv)
    {
      AppMethodBeat.o(46974);
      bool = true;
    }
    while (true)
    {
      return bool;
      g.RQ();
      int i = ((Integer)g.RP().Ry().get(ac.a.xTd, Integer.valueOf(-1))).intValue();
      if (i != -1)
      {
        if (i == 1)
        {
          AppMethodBeat.o(46974);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(46974);
          bool = false;
        }
      }
      else if (this.tCT != null)
      {
        if (this.tCT.field_lqt_state == 1)
        {
          AppMethodBeat.o(46974);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(46974);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(46974);
        bool = false;
      }
    }
  }

  public final int cQx()
  {
    if (this.tCT != null);
    for (int i = this.tCT.field_is_show_lqb; ; i = 0)
      return i;
  }

  public final boolean cQy()
  {
    boolean bool = true;
    if (this.tCT != null)
      if (this.tCT.field_is_open_lqb != 1);
    while (true)
    {
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }

  public final String cQz()
  {
    if (this.tCT != null);
    for (String str = this.tCT.field_lqb_open_url; ; str = null)
      return str;
  }

  public final void f(ArrayList<Bankcard> paramArrayList1, ArrayList<Bankcard> paramArrayList2)
  {
    AppMethodBeat.i(46983);
    if ((this.tlM == null) || (paramArrayList1 == null) || (paramArrayList2 == null))
    {
      ab.e("MicroMsg.WalletUserInfoManger", "error list, bankcards == null || bankcardsClone == null || virtualBankcardsClone == null");
      AppMethodBeat.o(46983);
    }
    while (true)
    {
      return;
      paramArrayList1.clear();
      paramArrayList2.clear();
      Iterator localIterator;
      if (this.tlM != null)
      {
        localIterator = this.tlM.iterator();
        while (localIterator.hasNext())
          paramArrayList1.add((Bankcard)localIterator.next());
      }
      if (this.tlN != null)
      {
        localIterator = this.tlN.iterator();
        while (localIterator.hasNext())
        {
          Bankcard localBankcard = (Bankcard)localIterator.next();
          if (localBankcard.field_wxcreditState == 0)
            paramArrayList2.add(localBankcard);
          else
            paramArrayList1.add(localBankcard);
        }
      }
      AppMethodBeat.o(46983);
    }
  }

  public final Bankcard h(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(46970);
    if ((paramBoolean1) && (this.thy != null) && (this.thy.field_bindSerial.equals(paramString)))
    {
      paramString = this.thy;
      AppMethodBeat.o(46970);
    }
    while (true)
    {
      return paramString;
      if ((paramBoolean2) && (this.tCZ != null) && (this.tCZ.field_bindSerial.equals(paramString)))
      {
        paramString = this.tCZ;
        AppMethodBeat.o(46970);
      }
      else
      {
        if ((this.tlM != null) && (!this.tlM.isEmpty()))
        {
          Iterator localIterator = this.tlM.iterator();
          while (true)
            if (localIterator.hasNext())
            {
              Bankcard localBankcard = (Bankcard)localIterator.next();
              if (localBankcard.field_bindSerial.equals(paramString))
              {
                AppMethodBeat.o(46970);
                paramString = localBankcard;
                break;
              }
            }
        }
        paramString = null;
        AppMethodBeat.o(46970);
      }
    }
  }

  public final ArrayList<Bankcard> nf(boolean paramBoolean)
  {
    AppMethodBeat.i(46979);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean)
    {
      if ((this.thy != null) && (!cQi()))
        localArrayList.add(this.thy);
      if ((this.tCZ != null) && (!cQi()))
        localArrayList.add(this.tCZ);
    }
    if ((this.tlM != null) && (this.tlM.size() > 0))
    {
      Iterator localIterator = this.tlM.iterator();
      while (localIterator.hasNext())
        localArrayList.add((Bankcard)localIterator.next());
    }
    AppMethodBeat.o(46979);
    return localArrayList;
  }

  @Deprecated
  public final ArrayList<Bankcard> ng(boolean paramBoolean)
  {
    AppMethodBeat.i(138555);
    ArrayList localArrayList = nf(paramBoolean);
    AppMethodBeat.o(138555);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.ak
 * JD-Core Version:    0.6.2
 */
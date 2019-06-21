package com.tencent.mm.ui.contact;

import android.database.Cursor;
import android.database.MergeCursor;
import android.util.SparseArray;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.openim.PluginOpenIM;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.openim.e.d;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class w extends o
  implements n.b
{
  private final String csB;
  private Cursor gnQ;
  private HashMap<String, Integer> zkO;
  private SparseArray<String> zkP;
  private w.a zok;

  public w(String paramString, MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean)
  {
    super(paramMMBaseSelectContactUI, paramList, false, paramBoolean, false);
    AppMethodBeat.i(33814);
    this.zkO = null;
    this.zkP = null;
    this.csB = paramString;
    this.zok = new w.a();
    ((j)g.K(j.class)).XM().a(this);
    Km();
    AppMethodBeat.o(33814);
  }

  private void Km()
  {
    AppMethodBeat.i(33816);
    label33: ArrayList localArrayList;
    Object localObject1;
    Object localObject2;
    int[] arrayOfInt;
    int i;
    int j;
    if (this.zkO != null)
    {
      this.zkO.clear();
      if (this.zkP == null)
        break label347;
      this.zkP.clear();
      localArrayList = new ArrayList();
      localObject1 = ((PluginOpenIM)g.M(PluginOpenIM.class)).getAppIdInfoStg().vm(this.csB);
      aw.ZK();
      localArrayList.add(c.XM().a(this.elZ, aa.gw(ah.getContext()), (List)localObject1));
      arQ("select rcontact.username ,rcontact.nickname ,rcontact.alias,rcontact.conRemark,rcontact.verifyFlag,rcontact.showHead,rcontact.weiboFlag,rcontact.rowid ,rcontact.deleteFlag,rcontact.lvbuff,rcontact.descWordingId, rcontact.openImAppid,  OpenIMWordingInfo.wording, OpenIMWordingInfo.quanpin  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId  and OpenIMWordingInfo.language='zh_CN'  where (type & 1!=0) and type & 32=0   and type & 8=0 and username like '%@openim' and username != 'appbrandcustomerservicemsg' and username != 'notifymessage' and username != 'weibo' and username != 'pc_share' and username != 'officialaccounts' and username != 'voicevoipapp' and username != 'cardpackage' and username != 'qqfriend' and username != 'helper_entry' and username != 'medianote' and username != 'shakeapp' and username != 'topstoryapp' and username != 'qmessage' and username != 'voipapp' and username != 'qqsync' and username != 'qqmail' and username != 'blogapp' and username != 'lbsapp' and username != 'readerapp' and username != 'feedsapp' and username != 'newsapp' and username != 'floatbottle' and username != 'fmessage' and username != 'tmessage' and username != 'weixin' and username != 'facebookapp' and username != 'meishiapp' and username != 'masssendapp' and username != 'voiceinputapp' and username != 'filehelper' and username != 'linkedinplugin' group by rcontact.openImAppid");
      aw.ZK();
      localObject2 = c.XM().b(this.elZ, aa.gw(ah.getContext()), (List)localObject1);
      arrayOfInt = new int[((Cursor)localObject2).getCount()];
      if (((Cursor)localObject2).moveToFirst())
      {
        i = 0;
        do
        {
          arrayOfInt[i] = ((Cursor)localObject2).getInt(0);
          i++;
        }
        while (((Cursor)localObject2).moveToNext());
      }
      ((Cursor)localObject2).close();
      aw.ZK();
      localObject1 = c.XM().c(this.elZ, aa.gw(ah.getContext()), (List)localObject1);
      if (((Cursor)localObject1).moveToFirst())
      {
        i = 0;
        j = 0;
      }
    }
    while (true)
    {
      localObject2 = new ad();
      ((ad)localObject2).d((Cursor)localObject1);
      bM(j, ((b)g.K(b.class)).ba(this.csB, ((ap)localObject2).field_descWordingId));
      j = arrayOfInt[i] + (j + 1);
      if (!((Cursor)localObject1).moveToNext())
      {
        ((Cursor)localObject1).close();
        ab.d("MicroMsg.OpenIMSelectContactAdapter", "headerPosMap=%s", new Object[] { this.zkO.toString() });
        this.gnQ = new MergeCursor((Cursor[])localArrayList.toArray(new Cursor[0]));
        notifyDataSetChanged();
        AppMethodBeat.o(33816);
        return;
        this.zkO = new HashMap();
        break;
        label347: this.zkP = new SparseArray();
        break label33;
      }
      i++;
    }
  }

  private static ArrayList<ad> arQ(String paramString)
  {
    AppMethodBeat.i(33815);
    aw.ZK();
    Cursor localCursor = c.XM().aoL(paramString);
    paramString = new ArrayList();
    if (localCursor.moveToFirst())
      do
      {
        ad localad = new ad();
        localad.d(localCursor);
        paramString.add(localad);
      }
      while (localCursor.moveToNext());
    localCursor.close();
    AppMethodBeat.o(33815);
    return paramString;
  }

  private void bM(int paramInt, String paramString)
  {
    AppMethodBeat.i(33817);
    this.zkO.put(paramString, Integer.valueOf(paramInt));
    this.zkP.put(paramInt, paramString);
    AppMethodBeat.o(33817);
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(33822);
    Km();
    notifyDataSetChanged();
    AppMethodBeat.o(33822);
  }

  public final int arM(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(33818);
    if (paramString.equals("↑"))
    {
      i = 0;
      AppMethodBeat.o(33818);
    }
    while (true)
    {
      return i;
      if (this.zkO != null)
      {
        if (this.zkO.containsKey(paramString))
        {
          i = ((Integer)this.zkO.get(paramString)).intValue() + this.zmV.getContentLV().getHeaderViewsCount();
          AppMethodBeat.o(33818);
        }
        else
        {
          AppMethodBeat.o(33818);
        }
      }
      else
        AppMethodBeat.o(33818);
    }
  }

  protected final boolean c(a parama)
  {
    AppMethodBeat.i(33823);
    int i = parama.position;
    boolean bool;
    if (this.zkP.indexOfKey(i + 1) >= 0)
    {
      bool = true;
      AppMethodBeat.o(33823);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33823);
    }
  }

  public final void finish()
  {
    AppMethodBeat.i(33821);
    super.finish();
    ab.i("MicroMsg.OpenIMSelectContactAdapter", "finish!");
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    ((j)g.K(j.class)).XM().b(this);
    AppMethodBeat.o(33821);
  }

  public final int getCount()
  {
    AppMethodBeat.i(33819);
    int i = this.gnQ.getCount();
    int j = this.zkO.size();
    AppMethodBeat.o(33819);
    return i + j;
  }

  protected final a mP(int paramInt)
  {
    AppMethodBeat.i(33820);
    Object localObject1;
    Object localObject2;
    if (this.zkP.indexOfKey(paramInt) >= 0)
    {
      localObject1 = (String)this.zkP.get(paramInt);
      localObject2 = new h(paramInt);
      ((h)localObject2).mKQ = ((String)localObject1);
      AppMethodBeat.o(33820);
    }
    while (true)
    {
      return localObject2;
      int i = 0;
      int j = paramInt;
      int k;
      int m;
      do
      {
        k = i;
        if (i > this.zkP.size())
          break;
        k = i;
        if (this.zkP.indexOfKey(j) >= 0)
          k = i + 1;
        m = j - 1;
        i = k;
        j = m;
      }
      while (m >= 0);
      i = paramInt - k;
      if (this.gnQ.moveToPosition(i))
      {
        ab.d("MicroMsg.OpenIMSelectContactAdapter", "create contact item position=%d | index=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
        localObject1 = new ad();
        ((ad)localObject1).d(this.gnQ);
        localObject2 = new e(paramInt);
        ((a)localObject2).ehM = ((ad)localObject1);
        ((a)localObject2).zmW = clI();
        ((a)localObject2).zmX = this.zmX;
        ((e)localObject2).zpP = true;
        AppMethodBeat.o(33820);
      }
      else
      {
        ab.i("MicroMsg.OpenIMSelectContactAdapter", "create contact item error: position=%d | index=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
        localObject2 = null;
        AppMethodBeat.o(33820);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.w
 * JD-Core Version:    0.6.2
 */
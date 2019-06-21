package com.tencent.mm.ui;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.a.a;
import com.tencent.mm.cd.a.d;
import com.tencent.mm.cd.a.e;
import com.tencent.mm.cd.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public abstract class f<K, T extends a> extends BaseAdapter
{
  public String TAG = "MicroMsg.CursorDataAdapter";
  public Context context;
  private HashMap<K, f.b<K, T>> events;
  private int nLf = 0;
  private int pageSize;
  private f<K, T>.e ygA;
  public K ygB = null;
  protected boolean ygr = true;
  protected f<K, T>.c ygs;
  protected f.a ygt;
  public int ygu = 1000;
  public int ygv = 3000;
  public boolean ygw = true;
  int ygx = 0;
  private boolean ygy;
  private boolean ygz;

  public f(Context paramContext)
  {
    this(paramContext, (byte)0);
    this.pageSize = 5000;
    ab.i(this.TAG, "newCursor setPageSize %d", new Object[] { Integer.valueOf(5000) });
  }

  private f(Context paramContext, byte paramByte)
  {
    this.context = paramContext;
    this.ygy = true;
  }

  private f(Context paramContext, char paramChar)
  {
    this.context = paramContext;
    this.ygy = true;
    this.ygz = false;
    this.ygu = 800;
    this.ygv = 2000;
  }

  public f(Context paramContext, short paramShort)
  {
    this(paramContext, '\000');
  }

  private void a(d<K> paramd)
  {
    pB(true);
    if ((this.ygs == null) || (this.ygs.ycB != paramd))
    {
      if ((this.ygs != null) && (!this.ygs.isClosed()))
      {
        this.ygs.close();
        this.ygs = null;
      }
      this.ygs = new f.c(this, paramd);
      this.ygs.getCount();
      dwx();
      notifyDataSetChanged();
    }
  }

  private void a(f<K, T>.c paramf)
  {
    pB(false);
    this.ygs = paramf;
    this.ygs.getCount();
    dwx();
  }

  private void a(final f<K, T>.c paramf, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      if ((this.ygA != null) && (this.ygA.dwM()))
        this.ygA.dwK();
      if (this.events != null)
        this.events.clear();
    }
    if (paramBoolean2)
      a(new d()
      {
        public final void dwG()
        {
          AppMethodBeat.i(29172);
          f.a(f.this, paramf);
          AppMethodBeat.o(29172);
        }
      });
    while (true)
    {
      return;
      a(paramf);
    }
  }

  private void a(d paramd)
  {
    long l = System.currentTimeMillis();
    if (this.ygt != null)
      this.ygt.dwH();
    paramd.dwG();
    notifyDataSetChanged();
    if (this.ygt != null)
      this.ygt.apt();
    if (this.ygA != null)
      this.ygA.dwN();
    ab.i(this.TAG, "newcursor update callback last :%d ", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
  }

  private void cb(String paramString, boolean paramBoolean)
  {
    if ((!dwE()) && ((this.ygw | paramBoolean)))
    {
      if (!paramBoolean)
        ab.i(this.TAG, "newcursor cache needRefresh : needRefreshInfront :%b from : %s %s", new Object[] { Boolean.valueOf(this.ygw), paramString, bo.dpG() });
      pA(false);
    }
  }

  private void dwB()
  {
    this.events.clear();
    this.events.put(this.ygB, null);
  }

  private void dwC()
  {
    if (!dwD())
      return;
    int i = getChangeType();
    int j;
    if (this.ygA != null)
    {
      j = this.ygA.dwO();
      ab.i(this.TAG, "newcursor mWorkerHandler.isHandingMsg,type is %d ", new Object[] { Integer.valueOf(j) });
      if (j != 0)
        this.ygA.dwK();
      if (i == 2);
    }
    while (true)
    {
      ab.i(this.TAG, "newcursor ensureNewState  refreshstatus is %d ", new Object[] { Integer.valueOf(j) });
      this.nLf = 0;
      if (j == 2)
      {
        a(new f.c(this, dwz()), true, true);
        break;
      }
      dwF();
      break;
      j = i;
    }
  }

  private boolean dwD()
  {
    if (((this.ygA != null) && (this.ygA.dwM())) || (getChangeType() != 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean dwE()
  {
    if (this.nLf == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void dwF()
  {
    if ((this.ygs != null) && (!this.ygs.isClosed()) && (this.events.size() == 0))
      ab.i(this.TAG, "events size is 0  ");
    while (true)
    {
      return;
      a(new f.1(this));
    }
  }

  private void dwx()
  {
    if (this.ygy)
      if (!this.ygs.dvr())
        break label96;
    label96: for (int i = 1; ; i = 2)
    {
      if ((i != this.ygx) && (this.ygx != 0))
      {
        if ((this.ygA != null) && (this.ygA.dwM()))
          a(new f.c(this, dwz()), true, false);
        ab.i(this.TAG, "newcursor change update stats  %d ", new Object[] { Integer.valueOf(i) });
      }
      this.ygx = i;
      return;
    }
  }

  private int getChangeType()
  {
    int i;
    if ((this.events == null) || (this.events.size() == 0))
      i = 0;
    while (true)
    {
      return i;
      if (this.events.containsKey(this.ygB))
        i = 2;
      else
        i = 1;
    }
  }

  public final T MG(int paramInt)
  {
    if (this.ygs == null)
      a(dwz());
    cb("getItem", false);
    this.ygs.ycB.moveToPosition(paramInt);
    a locala = this.ygs.ycB.MG(paramInt);
    if (locala != null)
      locala.drw();
    while (true)
    {
      return locala;
      ab.e(this.TAG, "newcursor getItem error %d", new Object[] { Integer.valueOf(paramInt) });
    }
  }

  public final void a(f.a parama)
  {
    this.ygt = parama;
  }

  public final void a(SparseArray<K>[] paramArrayOfSparseArray)
  {
    SparseArray[] arrayOfSparseArray = this.ygs.dvp();
    for (int i = 0; i < arrayOfSparseArray.length; i++)
    {
      arrayOfSparseArray[i].clear();
      for (int j = 0; j < paramArrayOfSparseArray[i].size(); j++)
        arrayOfSparseArray[i].put(j, paramArrayOfSparseArray[i].get(j));
    }
  }

  public abstract SparseArray<K>[] a(HashSet<f.b<K, T>> paramHashSet, SparseArray<K>[] paramArrayOfSparseArray);

  public abstract ArrayList<T> ao(ArrayList<K> paramArrayList);

  public final T cL(K paramK)
  {
    if (this.ygs == null);
    for (paramK = null; ; paramK = this.ygs.ycB.cL(paramK))
      return paramK;
  }

  protected boolean dvr()
  {
    if (this.ygs == null);
    for (boolean bool = false; ; bool = this.ygs.dvr())
      return bool;
  }

  public abstract T dvz();

  public final SparseArray<K>[] dwA()
  {
    Object localObject;
    if (this.ygs == null)
      localObject = null;
    while (true)
    {
      return localObject;
      SparseArray[] arrayOfSparseArray = this.ygs.dvp();
      localObject = new SparseArray[arrayOfSparseArray.length];
      for (int i = 0; i < localObject.length; i++)
      {
        localObject[i] = new SparseArray();
        for (int j = 0; j < arrayOfSparseArray[i].size(); j++)
          localObject[i].put(j, arrayOfSparseArray[i].get(j));
      }
    }
  }

  public final void dww()
  {
    this.ygt = null;
  }

  public final int dwy()
  {
    int i;
    if (this.ygs == null)
      i = 0;
    while (true)
    {
      return i;
      d locald = this.ygs.ycB;
      if (locald == null)
      {
        i = 0;
      }
      else
      {
        if (!(locald instanceof e))
          break;
        i = ((e)locald).ycs[0].getCount();
      }
    }
    throw new RuntimeException("the cursor is not instanceof MergeHeapCursor ,please call getCount() instead ");
  }

  public abstract d<K> dwz();

  public int getCount()
  {
    if (this.ygs == null)
    {
      long l = System.currentTimeMillis();
      a(dwz());
      ab.i(this.TAG, "newcursor createCursor last : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    }
    cb("getcount", false);
    return this.ygs.getCount();
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public void j(K paramK, int paramInt)
  {
    boolean bool;
    if (this.ygs != null)
    {
      if (this.events == null)
        this.events = new HashMap();
      bool = this.events.containsKey(this.ygB);
      if ((paramInt != 5) && (this.ygy) && (paramInt != 1))
        break label195;
      if (paramInt == 5)
        break label170;
      dwB();
    }
    label87: label740: 
    while (true)
    {
      ab.i(this.TAG, "newcursor syncHandle is true ,changeType is %d  ", new Object[] { Integer.valueOf(paramInt) });
      int i = 1;
      this.nLf = getChangeType();
      paramK = this.TAG;
      int j = this.nLf;
      if (this.ygx == 1)
      {
        bool = true;
        label116: ab.i(paramK, "newcursor refreshStatus: %d ,hasLoadedAllDataStatus %b changeType :%d ", new Object[] { Integer.valueOf(j), Boolean.valueOf(bool), Integer.valueOf(paramInt) });
        if (i == 0)
          break label720;
        ab.i(this.TAG, "newcursor event is refresh sync ");
        pA(true);
      }
      while (true)
      {
        return;
        if (bool)
          break label740;
        this.events.put(paramK, new f.b(paramK, paramInt));
        break;
        if (bool)
        {
          ab.i(this.TAG, "newcursor need reset ,return ");
        }
        else
        {
          if (this.ygx == 1)
          {
            if ((this.ygs.cK(paramK)) || (paramInt == 2))
            {
              HashMap localHashMap = this.events;
              f.b localb1 = new f.b(paramK, paramInt);
              if ((localb1.ygE == 2) && (this.ygs.cK(localb1.object)))
                localb1.ygE = 3;
              f.b localb2 = (f.b)localHashMap.get(paramK);
              if (localb2 != null)
              {
                i = 1;
                if (i == 0)
                  break label677;
                localHashMap.remove(localb2);
                switch (localb1.ygE)
                {
                case 3:
                case 4:
                default:
                  switch (localb2.ygE)
                  {
                  case 3:
                  case 4:
                  default:
                    localb1.ygE = 3;
                    localHashMap.put(paramK, localb1);
                  case 5:
                  case 2:
                  }
                  break;
                case 5:
                case 2:
                }
              }
              while (true)
              {
                paramK = this.ygs;
                i = localHashMap.size();
                if (!paramK.ycB.MF(i))
                {
                  ab.i(this.TAG, "newcursor events size exceed limit :size is :  %d", new Object[] { Integer.valueOf(localHashMap.size()) });
                  localHashMap.clear();
                  localHashMap.put(this.ygB, null);
                }
                ab.i(this.TAG, "newcursor add event events size %d", new Object[] { Integer.valueOf(this.events.size()) });
                i = 0;
                break;
                i = 0;
                break label302;
                switch (localb2.ygE)
                {
                case 2:
                case 3:
                case 4:
                default:
                  localb1.ygE = 5;
                  break;
                case 5:
                  ab.i(this.TAG, "newcursor processEvent last delete, now delete, impossible");
                  localb1.ygE = 5;
                  break;
                  switch (localb2.ygE)
                  {
                  case 3:
                  case 4:
                  default:
                    ab.i(this.TAG, "newcursor processEvent last update, now insert, impossible");
                    localb1.ygE = 2;
                    break;
                  case 5:
                    localb1.ygE = 3;
                    break;
                  case 2:
                    ab.i(this.TAG, "newcursor processEvent last insert, now insert, impossible");
                    localb1.ygE = 2;
                    break;
                    ab.i(this.TAG, "newcursor processEvent last delete, now update, impossible");
                    break label388;
                    localb1.ygE = 2;
                    break;
                    localHashMap.put(paramK, localb1);
                  }
                  break;
                }
              }
            }
            ab.i(this.TAG, "newcursor event pass ");
            i = 0;
            break label87;
          }
          dwB();
          i = 0;
          break label87;
          bool = false;
          break label116;
          if ((this.ygr) && (this.ygw))
            pA(false);
        }
      }
    }
  }

  public final void pA(boolean paramBoolean)
  {
    if ((this.ygz) || (paramBoolean))
      dwC();
    while (true)
    {
      this.nLf = 0;
      int i;
      while (true)
      {
        return;
        i = getChangeType();
        if (i != 0)
          break;
        ab.i(this.TAG, "newcursor need not change ");
      }
      if (i == 2)
      {
        ab.i(this.TAG, "newcursor enqueueMessage resetcursor ");
        this.events.clear();
      }
      if (this.ygA == null)
        this.ygA = new f.e(this);
      this.ygA.MR(i);
    }
  }

  public final void pB(boolean paramBoolean)
  {
    if (this.ygs != null)
    {
      this.ygs.close();
      this.ygs = null;
    }
    if ((paramBoolean) && (this.ygA != null))
    {
      this.ygA.quit();
      this.ygA = null;
      if (this.events != null)
      {
        this.events.clear();
        ab.i(this.TAG, "newcursor closeCursor,clear events");
      }
    }
    this.nLf = 0;
    this.ygx = 0;
  }

  public void pause()
  {
    this.ygr = false;
    ab.i(this.TAG, "new cursor pasue");
  }

  public final void resume()
  {
    ab.i(this.TAG, "newcursor resume ");
    this.ygr = true;
    cb("resume", true);
  }

  static abstract interface d
  {
    public abstract void dwG();
  }

  final class e$c extends ak
  {
    long lastUpdateTime;
    long ygP;
    final int ygQ;
    final int ygR;

    public e$c(Looper arg2)
    {
      super();
      AppMethodBeat.i(29179);
      this.ygQ = (hashCode() | 0x776);
      this.ygR = (hashCode() | 0x77A);
      f.this.ygI = new LinkedList();
      AppMethodBeat.o(29179);
    }

    public final void handleMessage(Message paramMessage)
    {
      AppMethodBeat.i(29180);
      super.handleMessage(paramMessage);
      if (paramMessage.what == this.ygR)
      {
        removeMessages(this.ygQ);
        long l = System.currentTimeMillis();
        if ((l - this.ygP > f.this.ygC.ygu) || (l - this.ygP < 0L) || ((this.lastUpdateTime != 0L) && (l - this.lastUpdateTime > f.this.ygC.ygv)) || (l - this.lastUpdateTime < 0L))
        {
          f.e.a(f.this);
          this.ygP = l;
          AppMethodBeat.o(29180);
        }
      }
      while (true)
      {
        return;
        sendEmptyMessageDelayed(this.ygQ, f.this.ygC.ygu);
        break;
        if (paramMessage.what == this.ygQ)
          f.e.a(f.this);
        AppMethodBeat.o(29180);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f
 * JD-Core Version:    0.6.2
 */
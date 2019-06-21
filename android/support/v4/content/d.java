package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class d
{
  private static d Gr;
  private static final Object mLock = new Object();
  private final Context Gn;
  private final HashMap<BroadcastReceiver, ArrayList<d.b>> Go = new HashMap();
  private final HashMap<String, ArrayList<d.b>> Gp = new HashMap();
  private final ArrayList<a> Gq = new ArrayList();
  private final Handler mHandler;

  private d(Context paramContext)
  {
    this.Gn = paramContext;
    this.mHandler = new Handler(paramContext.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        switch (paramAnonymousMessage.what)
        {
        default:
          super.handleMessage(paramAnonymousMessage);
        case 1:
        }
        while (true)
        {
          return;
          d.a(d.this);
        }
      }
    };
  }

  public static d S(Context paramContext)
  {
    synchronized (mLock)
    {
      if (Gr == null)
      {
        d locald = new android/support/v4/content/d;
        locald.<init>(paramContext.getApplicationContext());
        Gr = locald;
      }
      paramContext = Gr;
      return paramContext;
    }
  }

  public final void a(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    synchronized (this.Go)
    {
      d.b localb = new android/support/v4/content/d$b;
      localb.<init>(paramIntentFilter, paramBroadcastReceiver);
      Object localObject1 = (ArrayList)this.Go.get(paramBroadcastReceiver);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(1);
        this.Go.put(paramBroadcastReceiver, localObject2);
      }
      ((ArrayList)localObject2).add(localb);
      for (int i = 0; i < paramIntentFilter.countActions(); i++)
      {
        localObject1 = paramIntentFilter.getAction(i);
        localObject2 = (ArrayList)this.Gp.get(localObject1);
        paramBroadcastReceiver = (BroadcastReceiver)localObject2;
        if (localObject2 == null)
        {
          paramBroadcastReceiver = new java/util/ArrayList;
          paramBroadcastReceiver.<init>(1);
          this.Gp.put(localObject1, paramBroadcastReceiver);
        }
        paramBroadcastReceiver.add(localb);
      }
      return;
    }
  }

  public final boolean c(Intent paramIntent)
  {
    label408: label416: label419: 
    while (true)
    {
      Object localObject1;
      Object localObject2;
      int i;
      Object localObject3;
      synchronized (this.Go)
      {
        localObject1 = paramIntent.getAction();
        String str1 = paramIntent.resolveTypeIfNeeded(this.Gn.getContentResolver());
        Uri localUri = paramIntent.getData();
        String str2 = paramIntent.getScheme();
        localObject2 = paramIntent.getCategories();
        d.b localb;
        StringBuilder localStringBuilder;
        if ((paramIntent.getFlags() & 0x8) != 0)
        {
          i = 1;
          if (i != 0)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("Resolving type ");
            ((StringBuilder)localObject3).append(str1).append(" scheme ").append(str2).append(" of intent ").append(paramIntent);
          }
          ArrayList localArrayList = (ArrayList)this.Gp.get(paramIntent.getAction());
          if (localArrayList == null)
            break label408;
          if (i != 0)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("Action list: ");
            ((StringBuilder)localObject3).append(localArrayList);
          }
          localObject3 = null;
          int j = 0;
          if (j >= localArrayList.size())
            break label318;
          localb = (d.b)localArrayList.get(j);
          if (i != 0)
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("Matching against filter ");
            localStringBuilder.append(localb.filter);
          }
          if (localb.Gu)
          {
            if (i == 0)
              break label419;
            j++;
            continue;
          }
        }
        else
        {
          i = 0;
          continue;
        }
        int k = localb.filter.match((String)localObject1, str1, str2, localUri, (Set)localObject2, "LocalBroadcastManager");
        if (k < 0)
          break label419;
        if (i != 0)
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("  Filter matched!  match=0x");
          localStringBuilder.append(Integer.toHexString(k));
        }
        if (localObject3 != null)
          break label416;
        localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        ((ArrayList)localObject3).add(localb);
        localb.Gu = true;
      }
      label318: boolean bool;
      if (localObject3 != null)
      {
        for (i = 0; i < ((ArrayList)localObject3).size(); i++)
          ((d.b)((ArrayList)localObject3).get(i)).Gu = false;
        localObject2 = this.Gq;
        localObject1 = new android/support/v4/content/d$a;
        ((a)localObject1).<init>(paramIntent, (ArrayList)localObject3);
        ((ArrayList)localObject2).add(localObject1);
        if (!this.mHandler.hasMessages(1))
          this.mHandler.sendEmptyMessage(1);
        bool = true;
      }
      while (true)
      {
        return bool;
        bool = false;
      }
    }
  }

  public final void unregisterReceiver(BroadcastReceiver paramBroadcastReceiver)
  {
    synchronized (this.Go)
    {
      ArrayList localArrayList1 = (ArrayList)this.Go.remove(paramBroadcastReceiver);
      if (localArrayList1 == null)
        return;
      for (int i = localArrayList1.size() - 1; i >= 0; i--)
      {
        d.b localb1 = (d.b)localArrayList1.get(i);
        localb1.Gv = true;
        for (int j = 0; j < localb1.filter.countActions(); j++)
        {
          String str = localb1.filter.getAction(j);
          ArrayList localArrayList2 = (ArrayList)this.Gp.get(str);
          if (localArrayList2 != null)
          {
            for (int k = localArrayList2.size() - 1; k >= 0; k--)
            {
              d.b localb2 = (d.b)localArrayList2.get(k);
              if (localb2.receiver == paramBroadcastReceiver)
              {
                localb2.Gv = true;
                localArrayList2.remove(k);
              }
            }
            if (localArrayList2.size() <= 0)
              this.Gp.remove(str);
          }
        }
      }
    }
  }

  static final class a
  {
    final ArrayList<d.b> Gt;
    final Intent intent;

    a(Intent paramIntent, ArrayList<d.b> paramArrayList)
    {
      this.intent = paramIntent;
      this.Gt = paramArrayList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.content.d
 * JD-Core Version:    0.6.2
 */
package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class x
{
  private static final Object FC = new Object();
  private static Field FD;
  private static boolean FE;
  private static final Object FF = new Object();

  public static Bundle a(Notification.Builder paramBuilder, v.a parama)
  {
    paramBuilder.addAction(parama.icon, parama.title, parama.actionIntent);
    paramBuilder = new Bundle(parama.mExtras);
    if (parama.EB != null)
      paramBuilder.putParcelableArray("android.support.remoteInputs", a(parama.EB));
    if (parama.EC != null)
      paramBuilder.putParcelableArray("android.support.dataRemoteInputs", a(parama.EC));
    paramBuilder.putBoolean("android.support.allowGeneratedReplies", parama.ED);
    return paramBuilder;
  }

  public static Bundle a(Notification paramNotification)
  {
    while (true)
    {
      synchronized (FC)
      {
        if (FE)
        {
          paramNotification = null;
          return paramNotification;
        }
      }
      try
      {
        if (FD == null)
        {
          localObject2 = Notification.class.getDeclaredField("extras");
          if (!Bundle.class.isAssignableFrom(((Field)localObject2).getType()))
          {
            FE = true;
            paramNotification = null;
            continue;
          }
          ((Field)localObject2).setAccessible(true);
          FD = (Field)localObject2;
        }
        Bundle localBundle = (Bundle)FD.get(paramNotification);
        Object localObject2 = localBundle;
        if (localBundle == null)
        {
          localObject2 = new android/os/Bundle;
          ((Bundle)localObject2).<init>();
          FD.set(paramNotification, localObject2);
        }
        paramNotification = (Notification)localObject2;
        continue;
        paramNotification = finally;
        throw paramNotification;
      }
      catch (NoSuchFieldException paramNotification)
      {
        FE = true;
        paramNotification = null;
      }
      catch (IllegalAccessException paramNotification)
      {
        label110: break label110;
      }
    }
  }

  private static Bundle[] a(aa[] paramArrayOfaa)
  {
    if (paramArrayOfaa == null);
    Bundle[] arrayOfBundle;
    for (paramArrayOfaa = null; ; paramArrayOfaa = arrayOfBundle)
    {
      return paramArrayOfaa;
      arrayOfBundle = new Bundle[paramArrayOfaa.length];
      for (int i = 0; i < paramArrayOfaa.length; i++)
      {
        Object localObject1 = paramArrayOfaa[i];
        Bundle localBundle = new Bundle();
        localBundle.putString("resultKey", ((aa)localObject1).FU);
        localBundle.putCharSequence("label", ((aa)localObject1).FV);
        localBundle.putCharSequenceArray("choices", ((aa)localObject1).FW);
        localBundle.putBoolean("allowFreeFormInput", ((aa)localObject1).FX);
        localBundle.putBundle("extras", ((aa)localObject1).mExtras);
        Object localObject2 = ((aa)localObject1).FY;
        if ((localObject2 != null) && (!((Set)localObject2).isEmpty()))
        {
          localObject1 = new ArrayList(((Set)localObject2).size());
          localObject2 = ((Set)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
            ((ArrayList)localObject1).add((String)((Iterator)localObject2).next());
          localBundle.putStringArrayList("allowedDataTypes", (ArrayList)localObject1);
        }
        arrayOfBundle[i] = localBundle;
      }
    }
  }

  public static SparseArray<Bundle> i(List<Bundle> paramList)
  {
    Object localObject1 = null;
    int i = paramList.size();
    int j = 0;
    while (j < i)
    {
      Bundle localBundle = (Bundle)paramList.get(j);
      Object localObject2 = localObject1;
      if (localBundle != null)
      {
        localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = new SparseArray();
        ((SparseArray)localObject2).put(j, localBundle);
      }
      j++;
      localObject1 = localObject2;
    }
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.x
 * JD-Core Version:    0.6.2
 */
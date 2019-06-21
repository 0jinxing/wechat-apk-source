package com.tencent.mm.plugin.wear.model.a;

import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Wearable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class a
  implements b
{
  private GoogleApiClient tYq;

  public a()
  {
    AppMethodBeat.i(26356);
    this.tYq = new GoogleApiClient.Builder(ah.getContext()).addApi(Wearable.API).build();
    AppMethodBeat.o(26356);
  }

  public final b.a B(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26361);
    Object localObject = cUx();
    b.a locala = new b.a();
    Iterator localIterator = ((HashSet)localObject).iterator();
    String str;
    if (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      if (!cUw().isConnected())
      {
        localObject = new b.a((byte)0);
        label67: if (((b.a)localObject).code == 0)
          break label216;
      }
    }
    for (paramString = (String)localObject; ; paramString = locala)
    {
      AppMethodBeat.o(26361);
      return paramString;
      localObject = new b.a();
      Status localStatus = ((MessageApi.SendMessageResult)Wearable.MessageApi.sendMessage(cUw(), str, paramString, paramArrayOfByte).await(2L, TimeUnit.SECONDS)).getStatus();
      if (!localStatus.isSuccess())
      {
        ((b.a)localObject).code = 131072;
        ((b.a)localObject).aIm = localStatus.getStatusMessage();
        ab.e("MicroMsg.Wear.GlobalConnection", "send message not success errorCode=%d | errorMsg=%s", new Object[] { Integer.valueOf(localStatus.getStatusCode()), localStatus.getStatusMessage() });
      }
      if (paramArrayOfByte == null);
      for (int i = 0; ; i = paramArrayOfByte.length)
      {
        ab.d("MicroMsg.Wear.GlobalConnection", "send Message %s %s %d", new Object[] { str, paramString, Integer.valueOf(i) });
        break label67;
        label216: break;
      }
    }
  }

  public final b.a C(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26363);
    if (!cUw().isConnected())
    {
      paramString = new b.a((byte)0);
      AppMethodBeat.o(26363);
    }
    while (true)
    {
      return paramString;
      paramString = PutDataMapRequest.create(paramString);
      paramString.getDataMap().putLong("key_timestamp", System.currentTimeMillis());
      paramString.getDataMap().putAsset("key_data", Asset.createFromBytes(paramArrayOfByte));
      paramString = paramString.asPutDataRequest();
      Wearable.DataApi.putDataItem(cUw(), paramString);
      ab.d("MicroMsg.Wear.GlobalConnection", "send data request path=%s | length=%d", new Object[] { paramString.getUri().getPath(), Integer.valueOf(paramString.getData().length) });
      paramString = new b.a();
      AppMethodBeat.o(26363);
    }
  }

  public final byte[] a(Asset paramAsset)
  {
    AppMethodBeat.i(26360);
    DataApi.GetFdForAssetResult localGetFdForAssetResult = (DataApi.GetFdForAssetResult)Wearable.DataApi.getFdForAsset(cUw(), paramAsset).await();
    paramAsset = localGetFdForAssetResult.getStatus();
    if (!paramAsset.isSuccess())
    {
      ab.e("MicroMsg.Wear.GlobalConnection", "read asset data not success errorCode=%d | errorMsg=%s", new Object[] { Integer.valueOf(paramAsset.getStatusCode()), paramAsset.getStatusMessage() });
      paramAsset = null;
      AppMethodBeat.o(26360);
    }
    while (true)
    {
      return paramAsset;
      paramAsset = e.q(localGetFdForAssetResult.getInputStream());
      AppMethodBeat.o(26360);
    }
  }

  public final void cUv()
  {
    AppMethodBeat.i(26358);
    this.tYq.disconnect();
    cUw();
    AppMethodBeat.o(26358);
  }

  public final GoogleApiClient cUw()
  {
    AppMethodBeat.i(26359);
    if (!this.tYq.isConnected())
    {
      ab.i("MicroMsg.Wear.GlobalConnection", "connect to google api client");
      localObject = this.tYq.blockingConnect(30L, TimeUnit.SECONDS);
      if (!((ConnectionResult)localObject).isSuccess())
        ab.e("MicroMsg.Wear.GlobalConnection", "google api client connect error, code=%d, ", new Object[] { Integer.valueOf(((ConnectionResult)localObject).getErrorCode()) });
    }
    Object localObject = this.tYq;
    AppMethodBeat.o(26359);
    return localObject;
  }

  public final HashSet<String> cUx()
  {
    AppMethodBeat.i(26362);
    HashSet localHashSet = new HashSet();
    Object localObject = (NodeApi.GetConnectedNodesResult)Wearable.NodeApi.getConnectedNodes(cUw()).await();
    if (localObject != null)
    {
      localObject = ((NodeApi.GetConnectedNodesResult)localObject).getNodes().iterator();
      while (((Iterator)localObject).hasNext())
        localHashSet.add(((Node)((Iterator)localObject).next()).getId());
    }
    AppMethodBeat.o(26362);
    return localHashSet;
  }

  public final boolean cUy()
  {
    boolean bool = false;
    AppMethodBeat.i(26365);
    if (!cUw().isConnected())
      AppMethodBeat.o(26365);
    while (true)
    {
      return bool;
      if (cUx().size() == 0)
      {
        AppMethodBeat.o(26365);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(26365);
      }
    }
  }

  public final void cUz()
  {
    AppMethodBeat.i(26367);
    DataItemBuffer localDataItemBuffer = (DataItemBuffer)Wearable.DataApi.getDataItems(cUw()).await();
    Iterator localIterator = localDataItemBuffer.iterator();
    while (localIterator.hasNext())
    {
      DataItem localDataItem = (DataItem)localIterator.next();
      String str = localDataItem.getUri().toString();
      if (str.startsWith("/wechat"))
      {
        ab.i("MicroMsg.Wear.GlobalConnection", "delete data item %s", new Object[] { str });
        Wearable.DataApi.deleteDataItems(cUw(), localDataItem.getUri());
      }
    }
    localDataItemBuffer.release();
    AppMethodBeat.o(26367);
  }

  public final void finish()
  {
    AppMethodBeat.i(26366);
    this.tYq.disconnect();
    AppMethodBeat.o(26366);
  }

  public final boolean isAvailable()
  {
    AppMethodBeat.i(26357);
    boolean bool;
    if ((h.OY()) || (h.OX()))
    {
      bool = true;
      AppMethodBeat.o(26357);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(26357);
    }
  }

  public final boolean q(Uri paramUri)
  {
    AppMethodBeat.i(26364);
    Wearable.DataApi.deleteDataItems(cUw(), paramUri);
    ab.i("MicroMsg.Wear.GlobalConnection", "delete data item %s", new Object[] { paramUri });
    AppMethodBeat.o(26364);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.a.a
 * JD-Core Version:    0.6.2
 */
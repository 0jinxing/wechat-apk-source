package com.tencent.mm.plugin.facedetect.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult;
import com.tencent.mm.plugin.facedetect.model.FaceContextData;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.plugin.facedetect.model.g;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.plugin.facedetect.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.service.MMService;

public class FaceDetectProcessService extends MMService
{
  private FaceDetectProcessService.a lVQ;
  public g lVR;
  private Messenger lVS;
  private a lVT;

  public FaceDetectProcessService()
  {
    AppMethodBeat.i(340);
    this.lVQ = new FaceDetectProcessService.a(this);
    this.lVR = null;
    this.lVS = null;
    this.lVT = null;
    AppMethodBeat.o(340);
  }

  private void ec(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(347);
    ab.i("MicroMsg.FaceDetectProcessService", "alvinluo replyToClient requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Message localMessage = new Message();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    p(localMessage);
    AppMethodBeat.o(347);
  }

  private void l(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(348);
    Message localMessage = Message.obtain();
    localMessage.what = paramInt;
    if (paramBundle != null)
      localMessage.setData(paramBundle);
    p(localMessage);
    AppMethodBeat.o(348);
  }

  private void p(Message paramMessage)
  {
    AppMethodBeat.i(346);
    try
    {
      if (this.lVS != null)
      {
        ab.i("MicroMsg.FaceDetectProcessService", "alvinluo serivce send msg to client: %d, msg: %s, client hashCode: %d", new Object[] { Integer.valueOf(paramMessage.what), paramMessage.toString(), Integer.valueOf(this.lVS.hashCode()) });
        this.lVS.send(paramMessage);
      }
      AppMethodBeat.o(346);
      return;
    }
    catch (RemoteException paramMessage)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FaceDetectProcessService", paramMessage, "", new Object[0]);
        AppMethodBeat.o(346);
      }
    }
  }

  public final IBinder Iu()
  {
    AppMethodBeat.i(343);
    ab.i("MicroMsg.FaceDetectProcessService", "alvinluo service onBind hashCode: %d", new Object[] { Integer.valueOf(hashCode()) });
    this.lVQ = new FaceDetectProcessService.a(this);
    FaceDetectProcessService.a locala = this.lVQ;
    AppMethodBeat.o(343);
    return locala;
  }

  public final String getTag()
  {
    return "MicroMsg.FaceDetectProcessService";
  }

  public final void onCreate()
  {
    AppMethodBeat.i(341);
    ab.i("MicroMsg.FaceDetectProcessService", "alvinluo service onCreate hashCode: %d", new Object[] { Integer.valueOf(hashCode()) });
    super.onCreate();
    this.lVR = new g();
    AppMethodBeat.o(341);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(345);
    ab.i("MicroMsg.FaceDetectProcessService", "alvinluo service onDestroy");
    super.onDestroy();
    AppMethodBeat.o(345);
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(342);
    ab.i("MicroMsg.FaceDetectProcessService", "alvinluo onStartCommand");
    if (paramIntent == null)
    {
      ab.e("MicroMsg.FaceDetectProcessService", "intent is null!!");
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      AppMethodBeat.o(342);
    }
    Object localObject1;
    while (true)
    {
      return paramInt1;
      localObject1 = (Messenger)paramIntent.getParcelableExtra("k_messenger");
      if (localObject1 == null)
        break;
      this.lVS = ((Messenger)localObject1);
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      AppMethodBeat.o(342);
    }
    int i = paramIntent.getIntExtra("k_cmd", -1);
    ab.i("MicroMsg.FaceDetectProcessService", "hy: get command: %d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    case 2:
    case 3:
    default:
      ab.e("MicroMsg.FaceDetectProcessService", "hy: unsupported cmd");
    case 0:
    case 1:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      AppMethodBeat.o(342);
      break;
      String str = paramIntent.getStringExtra("k_bio_id");
      Object localObject2 = paramIntent.getByteArrayExtra("k_bio_config");
      FaceContextData.a((FaceContextData)paramIntent.getParcelableExtra("k_ontext_data"));
      switch (paramIntent.getIntExtra("k_server_scene", 2))
      {
      case 3:
      case 4:
      default:
        localObject1 = null;
        label251: this.lVT = ((a)localObject1);
        localObject1 = this.lVR;
        if (((g)localObject1).lTP != null)
        {
          ab.w("MicroMsg.FaceDetectNativeManager", "hy: last detection not destroyed");
          ((g)localObject1).bsH();
        }
        if (!p.bsN())
        {
          ab.w("MicroMsg.FaceDetectNativeManager", "hy: model file not valid");
          i = -4;
        }
        break;
      case 0:
      case 1:
      case 2:
      case 5:
      }
      while (true)
      {
        ec(0, i);
        break;
        localObject1 = null;
        break label251;
        localObject1 = new b();
        break label251;
        ((g)localObject1).lTP = new FaceProNative();
        i = ((g)localObject1).lTP.engineInit(str, (byte[])localObject2, p.bsP(), p.bsQ());
        ab.i("MicroMsg.FaceDetectNativeManager", "hy: init result : %d", new Object[] { Integer.valueOf(i) });
      }
      f.V(new FaceDetectProcessService.2(this, new q()
      {
        public final void b(final FaceProNative.FaceResult paramAnonymousFaceResult)
        {
          int i = -1;
          AppMethodBeat.i(337);
          boolean bool;
          int j;
          if (paramAnonymousFaceResult == null)
          {
            bool = true;
            if (paramAnonymousFaceResult == null)
              break label102;
            j = paramAnonymousFaceResult.result;
            label24: ab.i("MicroMsg.FaceDetectProcessService", "alvinluo release out result == null:%b, result: %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(j) });
            if ((paramAnonymousFaceResult != null) && (paramAnonymousFaceResult.result == 0))
              break label108;
            ab.i("MicroMsg.FaceDetectProcessService", "alvinluo release out data not valid");
            j = i;
            if (paramAnonymousFaceResult != null)
              j = paramAnonymousFaceResult.result;
            FaceDetectProcessService.a(FaceDetectProcessService.this, j);
            AppMethodBeat.o(337);
          }
          while (true)
          {
            return;
            bool = false;
            break;
            label102: j = -1;
            break label24;
            label108: f.V(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(336);
                String str = p.a(paramAnonymousFaceResult);
                Bundle localBundle = new Bundle();
                localBundle.putInt("key_face_result_code", 0);
                localBundle.putString("key_face_result_file_path", str);
                FaceDetectProcessService.a(FaceDetectProcessService.this, localBundle);
                AppMethodBeat.o(336);
              }
            });
            AppMethodBeat.o(337);
          }
        }
      }));
      continue;
      boolean bool = paramIntent.getBooleanExtra("key_is_need_video", false);
      com.tencent.mm.plugin.facedetect.e.a.btw().lZc = bool;
      continue;
      if (this.lVT != null)
      {
        this.lVT.S(paramIntent);
        continue;
        localObject1 = paramIntent.getStringExtra("key_bio_buffer_path");
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("key_bio_buffer_path", (String)localObject1);
        l(6, (Bundle)localObject2);
      }
    }
  }

  public final boolean onUnbind(Intent paramIntent)
  {
    AppMethodBeat.i(344);
    ab.i("MicroMsg.FaceDetectProcessService", "alvinluo service onUnbind");
    boolean bool = super.onUnbind(paramIntent);
    AppMethodBeat.o(344);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService
 * JD-Core Version:    0.6.2
 */
package com.tencent.tinker.loader.hotplug.interceptor;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.lang.reflect.Field;

public class HandlerMessageInterceptor extends Interceptor<Handler.Callback>
{
  private static Field ADv = null;
  private final Handler ADt;
  private final MessageHandler ADu;

  // ERROR //
  static
  {
    // Byte code:
    //   0: aconst_null
    //   1: putstatic 23	com/tencent/tinker/loader/hotplug/interceptor/HandlerMessageInterceptor:ADv	Ljava/lang/reflect/Field;
    //   4: ldc 2
    //   6: monitorenter
    //   7: getstatic 23	com/tencent/tinker/loader/hotplug/interceptor/HandlerMessageInterceptor:ADv	Ljava/lang/reflect/Field;
    //   10: astore_0
    //   11: aload_0
    //   12: ifnonnull +13 -> 25
    //   15: ldc 25
    //   17: ldc 27
    //   19: invokestatic 33	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   22: putstatic 23	com/tencent/tinker/loader/hotplug/interceptor/HandlerMessageInterceptor:ADv	Ljava/lang/reflect/Field;
    //   25: ldc 2
    //   27: monitorexit
    //   28: return
    //   29: astore_0
    //   30: ldc 2
    //   32: monitorexit
    //   33: aload_0
    //   34: athrow
    //   35: astore_0
    //   36: goto -11 -> 25
    //
    // Exception table:
    //   from	to	target	type
    //   7	11	29	finally
    //   15	25	29	finally
    //   25	28	29	finally
    //   30	33	29	finally
    //   15	25	35	java/lang/Throwable
  }

  public HandlerMessageInterceptor(Handler paramHandler, MessageHandler paramMessageHandler)
  {
    this.ADt = paramHandler;
    this.ADu = paramMessageHandler;
  }

  static class CallbackWrapper
    implements Handler.Callback, Interceptor.ITinkerHotplugProxy
  {
    private final HandlerMessageInterceptor.MessageHandler ADu;
    private final Handler.Callback ADw;
    private volatile boolean ADx;

    CallbackWrapper(HandlerMessageInterceptor.MessageHandler paramMessageHandler, Handler.Callback paramCallback)
    {
      this.ADu = paramMessageHandler;
      this.ADw = paramCallback;
      this.ADx = false;
    }

    public boolean handleMessage(Message paramMessage)
    {
      boolean bool = false;
      if (this.ADx)
        return bool;
      this.ADx = true;
      this.ADu.handleMessage(paramMessage);
      if (this.ADw != null);
      for (bool = this.ADw.handleMessage(paramMessage); ; bool = false)
      {
        this.ADx = false;
        break;
      }
    }
  }

  public static abstract interface MessageHandler
  {
    public abstract boolean handleMessage(Message paramMessage);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor
 * JD-Core Version:    0.6.2
 */
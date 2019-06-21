package com.tencent.ttpic.util;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;

public class PlayerUtil
{
  private static AudioManager sManager;

  public static PlayerUtil.Player createPlayer(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(50285);
    if (paramString.startsWith("assets://"))
    {
      paramContext = createPlayerFromAssets(paramContext, FileUtils.getRealPath(paramString), paramBoolean);
      AppMethodBeat.o(50285);
    }
    while (true)
    {
      return paramContext;
      paramContext = createPlayerFromUri(paramContext, paramString, paramBoolean);
      AppMethodBeat.o(50285);
    }
  }

  // ERROR //
  public static PlayerUtil.Player createPlayerFromAssets(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 50
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 6	com/tencent/ttpic/util/PlayerUtil$Player
    //   8: astore_3
    //   9: aload_3
    //   10: invokespecial 51	com/tencent/ttpic/util/PlayerUtil$Player:<init>	()V
    //   13: aload_0
    //   14: invokevirtual 57	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   17: aload_1
    //   18: invokevirtual 63	android/content/res/AssetManager:openFd	(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   21: astore_0
    //   22: aload_3
    //   23: aload_0
    //   24: invokevirtual 69	android/content/res/AssetFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   27: aload_0
    //   28: invokevirtual 73	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   31: aload_0
    //   32: invokevirtual 76	android/content/res/AssetFileDescriptor:getLength	()J
    //   35: invokevirtual 80	com/tencent/ttpic/util/PlayerUtil$Player:setDataSource	(Ljava/io/FileDescriptor;JJ)V
    //   38: aload_0
    //   39: invokevirtual 83	android/content/res/AssetFileDescriptor:close	()V
    //   42: aload_3
    //   43: iload_2
    //   44: invokestatic 87	com/tencent/ttpic/util/PlayerUtil:preparePlayer	(Lcom/tencent/ttpic/util/PlayerUtil$Player;Z)V
    //   47: ldc 50
    //   49: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   52: aload_3
    //   53: areturn
    //   54: astore_0
    //   55: aconst_null
    //   56: astore_3
    //   57: aload_3
    //   58: invokestatic 91	com/tencent/ttpic/util/PlayerUtil:destroyPlayer	(Lcom/tencent/ttpic/util/PlayerUtil$Player;)V
    //   61: ldc 50
    //   63: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: aconst_null
    //   67: astore_3
    //   68: goto -16 -> 52
    //   71: astore_0
    //   72: goto -15 -> 57
    //
    // Exception table:
    //   from	to	target	type
    //   5	13	54	java/io/IOException
    //   13	47	71	java/io/IOException
  }

  // ERROR //
  public static PlayerUtil.Player createPlayerFromUri(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 92
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 6	com/tencent/ttpic/util/PlayerUtil$Player
    //   8: astore_3
    //   9: aload_3
    //   10: invokespecial 51	com/tencent/ttpic/util/PlayerUtil$Player:<init>	()V
    //   13: aload_3
    //   14: aload_0
    //   15: aload_1
    //   16: invokestatic 98	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   19: invokevirtual 101	com/tencent/ttpic/util/PlayerUtil$Player:setDataSource	(Landroid/content/Context;Landroid/net/Uri;)V
    //   22: aload_3
    //   23: iload_2
    //   24: invokestatic 87	com/tencent/ttpic/util/PlayerUtil:preparePlayer	(Lcom/tencent/ttpic/util/PlayerUtil$Player;Z)V
    //   27: ldc 92
    //   29: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_3
    //   33: areturn
    //   34: astore_0
    //   35: aconst_null
    //   36: astore_3
    //   37: aload_3
    //   38: invokestatic 91	com/tencent/ttpic/util/PlayerUtil:destroyPlayer	(Lcom/tencent/ttpic/util/PlayerUtil$Player;)V
    //   41: ldc 92
    //   43: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: aconst_null
    //   47: astore_3
    //   48: goto -16 -> 32
    //   51: astore_0
    //   52: goto -15 -> 37
    //
    // Exception table:
    //   from	to	target	type
    //   5	13	34	java/io/IOException
    //   13	27	51	java/io/IOException
  }

  // ERROR //
  public static PlayerUtil.Recorder createRecorder(String paramString)
  {
    // Byte code:
    //   0: ldc 106
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 8	com/tencent/ttpic/util/PlayerUtil$Recorder
    //   8: astore_1
    //   9: aload_1
    //   10: invokespecial 107	com/tencent/ttpic/util/PlayerUtil$Recorder:<init>	()V
    //   13: aload_1
    //   14: aload_0
    //   15: invokevirtual 111	com/tencent/ttpic/util/PlayerUtil$Recorder:setOutputFile	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: iconst_1
    //   20: invokevirtual 114	com/tencent/ttpic/util/PlayerUtil$Recorder:setAudioSource	(I)V
    //   23: aload_1
    //   24: iconst_1
    //   25: invokevirtual 117	com/tencent/ttpic/util/PlayerUtil$Recorder:setAudioChannels	(I)V
    //   28: aload_1
    //   29: ldc 118
    //   31: invokevirtual 121	com/tencent/ttpic/util/PlayerUtil$Recorder:setAudioSamplingRate	(I)V
    //   34: aload_1
    //   35: ldc 122
    //   37: invokevirtual 125	com/tencent/ttpic/util/PlayerUtil$Recorder:setAudioEncodingBitRate	(I)V
    //   40: aload_1
    //   41: iconst_2
    //   42: invokevirtual 128	com/tencent/ttpic/util/PlayerUtil$Recorder:setOutputFormat	(I)V
    //   45: aload_1
    //   46: iconst_3
    //   47: invokevirtual 131	com/tencent/ttpic/util/PlayerUtil$Recorder:setAudioEncoder	(I)V
    //   50: new 133	com/tencent/ttpic/util/PlayerUtil$5
    //   53: astore_0
    //   54: aload_0
    //   55: invokespecial 134	com/tencent/ttpic/util/PlayerUtil$5:<init>	()V
    //   58: aload_1
    //   59: aload_0
    //   60: invokevirtual 138	com/tencent/ttpic/util/PlayerUtil$Recorder:setOnErrorListener	(Landroid/media/MediaRecorder$OnErrorListener;)V
    //   63: aload_1
    //   64: invokevirtual 141	com/tencent/ttpic/util/PlayerUtil$Recorder:prepare	()V
    //   67: ldc 106
    //   69: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: aload_1
    //   73: areturn
    //   74: astore_0
    //   75: aconst_null
    //   76: astore_1
    //   77: aload_1
    //   78: invokestatic 145	com/tencent/ttpic/util/PlayerUtil:destroyRecorder	(Lcom/tencent/ttpic/util/PlayerUtil$Recorder;)V
    //   81: aconst_null
    //   82: astore_1
    //   83: goto -16 -> 67
    //   86: astore_0
    //   87: goto -10 -> 77
    //
    // Exception table:
    //   from	to	target	type
    //   5	13	74	java/lang/Exception
    //   13	67	86	java/lang/Exception
  }

  public static void destroyPlayer(PlayerUtil.Player paramPlayer)
  {
    AppMethodBeat.i(50292);
    if (paramPlayer != null)
    {
      paramPlayer.stop();
      paramPlayer.reset();
      paramPlayer.release();
    }
    AppMethodBeat.o(50292);
  }

  public static void destroyRecorder(PlayerUtil.Recorder paramRecorder)
  {
    AppMethodBeat.i(50297);
    if (paramRecorder != null)
    {
      paramRecorder.stop();
      paramRecorder.reset();
      paramRecorder.release();
    }
    AppMethodBeat.o(50297);
  }

  private static AudioManager getAudioManager(Context paramContext)
  {
    AppMethodBeat.i(50302);
    if (sManager == null)
      sManager = (AudioManager)paramContext.getSystemService("audio");
    paramContext = sManager;
    AppMethodBeat.o(50302);
    return paramContext;
  }

  public static int getMaxVolume(Context paramContext)
  {
    AppMethodBeat.i(50300);
    int i = getAudioManager(paramContext).getStreamMaxVolume(3);
    AppMethodBeat.o(50300);
    return i;
  }

  public static int getVolume(Context paramContext)
  {
    AppMethodBeat.i(50299);
    int i = getAudioManager(paramContext).getStreamVolume(3);
    AppMethodBeat.o(50299);
    return i;
  }

  public static boolean isSilentMode(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(50301);
    switch (getAudioManager(paramContext).getRingerMode())
    {
    default:
      AppMethodBeat.o(50301);
    case 2:
    case 0:
    case 1:
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(50301);
      continue;
      AppMethodBeat.o(50301);
      bool = true;
      continue;
      AppMethodBeat.o(50301);
      bool = true;
    }
  }

  private boolean isSupportedAudioSamplingRate(int paramInt)
  {
    AppMethodBeat.i(50295);
    boolean bool;
    if (AudioRecord.getMinBufferSize(paramInt, 16, 2) > 0)
    {
      bool = true;
      AppMethodBeat.o(50295);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(50295);
    }
  }

  private static void preparePlayer(PlayerUtil.Player paramPlayer, boolean paramBoolean)
  {
    AppMethodBeat.i(50288);
    paramPlayer.setAudioStreamType(3);
    paramPlayer.setLooping(paramBoolean);
    paramPlayer.setOnCompletionListener(new PlayerUtil.1());
    paramPlayer.setOnErrorListener(new PlayerUtil.2());
    paramPlayer.prepare();
    AppMethodBeat.o(50288);
  }

  public static void seekPlayer(PlayerUtil.Player paramPlayer, int paramInt)
  {
    AppMethodBeat.i(50290);
    if (paramPlayer != null)
    {
      paramPlayer.setOnSeekCompleteListener(new PlayerUtil.4());
      paramPlayer.seekTo(paramInt);
    }
    AppMethodBeat.o(50290);
  }

  public static void setMute(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(50293);
    getAudioManager(paramContext).setStreamMute(3, paramBoolean);
    AppMethodBeat.o(50293);
  }

  public static void setVolume(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(50298);
    getAudioManager(paramContext).setStreamVolume(3, Math.min(Math.max(paramInt, 0), getMaxVolume(paramContext)), 8);
    AppMethodBeat.o(50298);
  }

  public static void startPlayer(PlayerUtil.Player paramPlayer, boolean paramBoolean)
  {
    AppMethodBeat.i(50289);
    if (paramPlayer != null)
      if (paramBoolean)
      {
        paramPlayer.setOnSeekCompleteListener(new PlayerUtil.3());
        paramPlayer.seekTo(0);
        AppMethodBeat.o(50289);
      }
    while (true)
    {
      return;
      paramPlayer.start();
      AppMethodBeat.o(50289);
    }
  }

  public static void startRecorder(PlayerUtil.Recorder paramRecorder)
  {
    AppMethodBeat.i(50296);
    if (paramRecorder != null)
      paramRecorder.start();
    AppMethodBeat.o(50296);
  }

  public static void stopPlayer(PlayerUtil.Player paramPlayer)
  {
    AppMethodBeat.i(50291);
    if (paramPlayer != null)
      paramPlayer.pause();
    AppMethodBeat.o(50291);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.PlayerUtil
 * JD-Core Version:    0.6.2
 */
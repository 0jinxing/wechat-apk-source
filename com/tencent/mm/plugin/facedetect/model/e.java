package com.tencent.mm.plugin.facedetect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.av;

public final class e
{
  private static long lTI = -1L;
  private static long lTJ = -1L;
  private static float lTK = -1.0F;

  public static boolean bst()
  {
    AppMethodBeat.i(188);
    boolean bool = Boolean.parseBoolean(av.fly.T("last_login_face_use_debug_mode", "false"));
    AppMethodBeat.o(188);
    return bool;
  }

  public static boolean bsu()
  {
    AppMethodBeat.i(189);
    boolean bool = Boolean.parseBoolean(av.fly.T("last_login_face_is_force_upload_face", "false"));
    AppMethodBeat.o(189);
    return bool;
  }

  public static boolean bsv()
  {
    AppMethodBeat.i(190);
    boolean bool = Boolean.parseBoolean(av.fly.T("last_login_face_save_correct_debug_mode", "false"));
    AppMethodBeat.o(190);
    return bool;
  }

  public static boolean bsw()
  {
    AppMethodBeat.i(191);
    boolean bool = Boolean.parseBoolean(av.fly.T("last_login_face_save_final_debug_mode", "false"));
    AppMethodBeat.o(191);
    return bool;
  }

  public static boolean bsx()
  {
    AppMethodBeat.i(192);
    boolean bool = Boolean.parseBoolean(av.fly.T("last_login_face_save_lip_reading", "false"));
    AppMethodBeat.o(192);
    return bool;
  }

  public static boolean bsy()
  {
    AppMethodBeat.i(193);
    boolean bool = Boolean.parseBoolean(av.fly.T("last_login_face_save_final_voice", "false"));
    AppMethodBeat.o(193);
    return bool;
  }

  public static void gU(boolean paramBoolean)
  {
    AppMethodBeat.i(194);
    av.fly.ak("last_login_face_use_debug_mode", String.valueOf(paramBoolean));
    AppMethodBeat.o(194);
  }

  public static void gV(boolean paramBoolean)
  {
    AppMethodBeat.i(195);
    av.fly.ak("last_login_face_save_correct_debug_mode", String.valueOf(paramBoolean));
    AppMethodBeat.o(195);
  }

  public static void gW(boolean paramBoolean)
  {
    AppMethodBeat.i(196);
    av.fly.ak("last_login_face_save_final_debug_mode", String.valueOf(paramBoolean));
    AppMethodBeat.o(196);
  }

  public static void gX(boolean paramBoolean)
  {
    AppMethodBeat.i(197);
    av.fly.ak("last_login_face_save_lip_reading", String.valueOf(paramBoolean));
    AppMethodBeat.o(197);
  }

  public static void gY(boolean paramBoolean)
  {
    AppMethodBeat.i(198);
    av.fly.ak("last_login_face_save_final_voice", String.valueOf(paramBoolean));
    AppMethodBeat.o(198);
  }

  public static void gZ(boolean paramBoolean)
  {
    AppMethodBeat.i(199);
    av.fly.ak("last_login_face_is_force_upload_face", String.valueOf(paramBoolean));
    AppMethodBeat.o(199);
  }

  public static void il(long paramLong)
  {
    lTI = paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.e
 * JD-Core Version:    0.6.2
 */
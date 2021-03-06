package com.tencent.ttpic.config;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum BeautyRealConfig$TYPE
{
  public int value;

  static
  {
    AppMethodBeat.i(81858);
    BEAUTY = new TYPE("BEAUTY", 0, 0);
    FACE_V = new TYPE("FACE_V", 1, 1);
    FACE_THIN = new TYPE("FACE_THIN", 2, 2);
    FACE_SHORTEN = new TYPE("FACE_SHORTEN", 3, 10);
    CHIN = new TYPE("CHIN", 4, 3);
    EYE = new TYPE("EYE", 5, 4);
    NOSE = new TYPE("NOSE", 6, 5);
    NONE = new TYPE("NONE", 7, 6);
    NATURE = new TYPE("NATURE", 8, 7);
    CUTE = new TYPE("CUTE", 9, 8);
    MELON = new TYPE("MELON", 10, 9);
    BASIC3 = new TYPE("BASIC3", 11, 11);
    REMOVE_POUNCH = new TYPE("REMOVE_POUNCH", 12, 12);
    EYE_LIGHTEN = new TYPE("EYE_LIGHTEN", 13, 13);
    AUTO_BRIGHTNESS = new TYPE("AUTO_BRIGHTNESS", 14, 14);
    FOREHEAD = new TYPE("FOREHEAD", 15, 15);
    EYE_DISTANCE = new TYPE("EYE_DISTANCE", 16, 16);
    EYE_ANGLE = new TYPE("EYE_ANGLE", 17, 17);
    MOUTH_SHAPE = new TYPE("MOUTH_SHAPE", 18, 18);
    TOOTH_WHITEN = new TYPE("TOOTH_WHITEN", 19, 19);
    COLOR_TONE = new TYPE("COLOR_TONE", 20, 20);
    CONTRAST_RATIO = new TYPE("CONTRAST_RATIO", 21, 21);
    NOSE_WING = new TYPE("NOSE_WING", 22, 22);
    NOSE_POSITION = new TYPE("NOSE_POSITION", 23, 23);
    LIPS_THICKNESS = new TYPE("LIPS_THICKNESS", 24, 24);
    LIPS_WIDTH = new TYPE("LIPS_WIDTH", 25, 25);
    WUGUANLITI = new TYPE("WUGUANLITI", 26, 26);
    FACECOLOR = new TYPE("FACECOLOR", 27, 27);
    EMPTY = new TYPE("EMPTY", 28, -1);
    $VALUES = new TYPE[] { BEAUTY, FACE_V, FACE_THIN, FACE_SHORTEN, CHIN, EYE, NOSE, NONE, NATURE, CUTE, MELON, BASIC3, REMOVE_POUNCH, EYE_LIGHTEN, AUTO_BRIGHTNESS, FOREHEAD, EYE_DISTANCE, EYE_ANGLE, MOUTH_SHAPE, TOOTH_WHITEN, COLOR_TONE, CONTRAST_RATIO, NOSE_WING, NOSE_POSITION, LIPS_THICKNESS, LIPS_WIDTH, WUGUANLITI, FACECOLOR, EMPTY };
    AppMethodBeat.o(81858);
  }

  private BeautyRealConfig$TYPE(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.config.BeautyRealConfig.TYPE
 * JD-Core Version:    0.6.2
 */
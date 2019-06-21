package com.tencent.mm.plugin.story.h;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/ConstantsStory;", "", "()V", "Companion", "StoryCommentSyncFlag", "StoryInfoLocalFlag", "StoryMixLocalFlag", "UploadStatus", "plugin-story_release"})
public final class a
{
  private static final int scA = 20;
  private static final int scB = 30;
  private static final String scC = "@__weixinstory";
  private static final String scD = "@__weixinhistory";
  private static final int scE = 1;
  private static final int scF = 2;
  private static final int scG = 2;
  private static final int scH = 311;
  private static final int scI = 314;
  private static final int scJ = 315;
  private static final int scK = 317;
  private static final int scL = 1;
  private static final int scM = 2;
  private static final int scN = 4;
  private static final int scO = 5;
  private static final int scP = 1;
  private static final int scQ = 2;
  private static final int scR = 1;
  private static final int scS = 2;
  private static final int scT = 3;
  private static final int scU = 4;
  private static final int scV = 5;
  private static final int scW = 6;
  private static final int scX = 14400;
  private static final int scY = 86400;
  private static final int scZ = 100;
  private static final int scw = 4;
  private static final int scx = 8;
  private static final int scy = 16;
  private static final String scz = "story_table_";
  private static final long sda = 1L;
  private static final long sdb = 2L;
  private static final int sdc = 9;
  private static final int sdd = 4;
  private static final int sde = 8;
  private static final float sdf = 1.78F;
  private static final float sdg = 2.18F;
  private static final int sdh = 3;
  private static final int sdi = 0;
  private static final int sdj = 1;
  private static final int sdk = 5;
  private static final int sdl = 7;
  public static final a sdm;

  static
  {
    AppMethodBeat.i(109854);
    sdm = new a((byte)0);
    scw = 4;
    scx = 8;
    scy = 16;
    scz = "story_table_";
    scA = 20;
    scB = 30;
    scC = "@__weixinstory";
    scD = "@__weixinhistory";
    scE = 1;
    scF = 2;
    scG = 2;
    scH = 311;
    scI = 314;
    scJ = 315;
    scK = 317;
    scL = 1;
    scM = 2;
    scN = 4;
    scO = 5;
    scP = 1;
    scQ = 2;
    scR = 1;
    scS = 2;
    scT = 3;
    scU = 4;
    scV = 5;
    scW = 6;
    scX = 14400;
    scY = 86400;
    scZ = 100;
    sda = 1L;
    sdb = 2L;
    sdc = 9;
    sdd = 4;
    sde = 8;
    sdf = 1.78F;
    sdg = 2.18F;
    sdh = 3;
    sdj = 1;
    sdk = 5;
    sdl = 7;
    AppMethodBeat.o(109854);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/ConstantsStory$Companion;", "", "()V", "DEFAULT_AUDIO_COUNT", "", "ERR_LOCAL_MEDIA_DB_NOT_E", "getERR_LOCAL_MEDIA_DB_NOT_E", "()I", "ERR_NOT_WITH_ARG", "getERR_NOT_WITH_ARG", "ERR_PARSER_ERROR", "getERR_PARSER_ERROR", "ERR_PULL_XML", "getERR_PULL_XML", "ERR_TIMELINE_NULL", "getERR_TIMELINE_NULL", "ERR_TLE", "getERR_TLE", "HISTORY_COUNT", "getHISTORY_COUNT", "HISTORY_NAME", "", "getHISTORY_NAME", "()Ljava/lang/String;", "LOCAL_FLAG_MP4_OPT", "MAX_FAULT_NUM", "getMAX_FAULT_NUM", "MAX_FAVORITE_COUNT", "getMAX_FAVORITE_COUNT", "MAX_SAFE_AREA_SCALE", "", "getMAX_SAFE_AREA_SCALE", "()F", "MIN_SAFE_AREA_SCALE", "getMIN_SAFE_AREA_SCALE", "MIN_THREAD_NUM", "getMIN_THREAD_NUM", "MMSTORY_MENU_ITEM_ID_DEL", "getMMSTORY_MENU_ITEM_ID_DEL", "MMSTORY_MENU_ITEM_ID_RESEND", "getMMSTORY_MENU_ITEM_ID_RESEND", "MMSTORY_OBJ_OP_DEL_COMMENT_TYPE", "getMMSTORY_OBJ_OP_DEL_COMMENT_TYPE", "MMSTORY_OBJ_OP_DEL_OBJ_TYPE", "getMMSTORY_OBJ_OP_DEL_OBJ_TYPE", "MMSTORY_OBJ_OP_FAV_TYPE", "getMMSTORY_OBJ_OP_FAV_TYPE", "MMSTORY_OBJ_OP_VISIBILITY_TYPE", "getMMSTORY_OBJ_OP_VISIBILITY_TYPE", "MMSTORY_RET_EMPTY", "getMMSTORY_RET_EMPTY", "MMSTORY_RET_NO_MORE_DATA", "getMMSTORY_RET_NO_MORE_DATA", "MMSTORY_RET_POST_DUPLICATE_ERR", "getMMSTORY_RET_POST_DUPLICATE_ERR", "MMSTORY_RET_SAME_MD5", "getMMSTORY_RET_SAME_MD5", "MMSTORY_URL_CDN", "getMMSTORY_URL_CDN", "MMSTORY_URL_OTHER", "getMMSTORY_URL_OTHER", "MMSTORY_URL_WEIXIN", "getMMSTORY_URL_WEIXIN", "STORY_DIED_TIMS_SECOND", "getSTORY_DIED_TIMS_SECOND", "STORY_ITEM_FAVORITE_FLAG", "getSTORY_ITEM_FAVORITE_FLAG", "STORY_ITEM_VISIABLE_ONLY_SELF_FLAG", "getSTORY_ITEM_VISIABLE_ONLY_SELF_FLAG", "STORY_NAME", "getSTORY_NAME", "STORY_RPT_15615_SCENE", "getSTORY_RPT_15615_SCENE", "STORY_RPT_SEND_SOURCE_CAPTURE", "", "getSTORY_RPT_SEND_SOURCE_CAPTURE", "()J", "STORY_RPT_SEND_SOURCE_LOCAL", "getSTORY_RPT_SEND_SOURCE_LOCAL", "STORY_SOURCE_ALBUM_HISTORY", "getSTORY_SOURCE_ALBUM_HISTORY", "STORY_SOURCE_USERPAGE_OTHERS", "getSTORY_SOURCE_USERPAGE_OTHERS", "STORY_SOURCE_USERPAGE_SELF", "getSTORY_SOURCE_USERPAGE_SELF", "STORY_TRY_TIMS_SECOND", "getSTORY_TRY_TIMS_SECOND", "TABLE_STORY", "getTABLE_STORY", "USERPAGE_COUNT", "getUSERPAGE_COUNT", "USER_PAGE_SOURCE_FAV", "getUSER_PAGE_SOURCE_FAV", "USER_PAGE_SOURCE_HISTORY", "getUSER_PAGE_SOURCE_HISTORY", "USER_PAGE_SOURCE_PROFILE", "getUSER_PAGE_SOURCE_PROFILE", "USER_PAGE_SOURCE_SELECT_FAV", "getUSER_PAGE_SOURCE_SELECT_FAV", "plugin-story_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.a
 * JD-Core Version:    0.6.2
 */
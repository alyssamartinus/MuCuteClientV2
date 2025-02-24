package com.mucheng.mucute.client.game

object TranslationManager {

    private val map = HashMap<String, Map<String, String>>()

    init {
        map["en"] = en()
        map["zh"] = zh()
    }

    private fun en() = buildMap {
        put("fly", "Fly")
        put("no_clip", "No Clip")
        put("zoom", "Zoom")
        put("air_jump", "Air Jump")
        put("speed", "Speed")
        put("full_bright", "Full Bright")
        put("haste", "Haste")
        put("jetpack", "Jetpack")
        put("levitation", "Levitation")
        put("high_jump", "High Jump")
        put("slow_falling", "Slow Falling")
        put("anti_knockback", "Velocity")
        put("poseidon", "Poseidon")
        put("regeneration", "Regen")
        put("bhop", "BHOP")
        put("sprint", "Sprint")
        put("no_hurt_camera", "No Hurt Cam")
        put("anti_afk", "Anti AFK")
        put("auto_walk", "Auto Walk")
        put("desync", "Desync")
        put("position_logger", "Entity Tracer")
        put("killaura", "Killaura")
        put("motion_fly", "Motion Fly")
        put("free_camera", "Free Camera")
        put("player_tracer", "Player Tracker")
        put("critic", "Criticals")
        put("nausea", "Nausea")
        put("health_boost", "Health Boost")
        put("jump_boost", "Jump Boost")
        put("resistance", "Resistance")
        put("fire_resist", "Fire Resistance")
        put("swiftness", "Swiftness")
        put("instant_health", "Instant Health")
        put("strength", "Strength")
        put("instant_damage", "Instant Damage")
        put("anti_crystal", "Anti Crystal")
        put("bad_omen", "Bad Omen")
        put("conduit_power", "Conduit Power")
        put("darkness", "Darkness")
        put("fatal_poison", "Fatal Poison")
        put("hunger", "Hunger")
        put("poison", "Poison")
        put("village_omen", "Village Hero")
        put("weakness", "Weakness")
        put("wither", "Wither")
        put("night_vision", "Night Vision")
        put("invisibility", "Invisibility")
        put("saturation", "Saturation")
        put("absorption", "Absorption")
        put("blindness", "Blindness")
        put("hunger", "Hunger")
        put("time_shift", "Time Changer")
        put("weather_controller", "Weather Control")
        put("crash", "Crash")
        put("fake_death", "FakeDeath")

        // Below for module options
        put("times", "Times")
        put("flySpeed", "Fly Speed")
        put("range", "Range")
        put("cps", "CPS")
        put("amplifier", "Amplifier")
        put("nightVision", "Night Vision")
        put("scanRadius", "Scan Radius")
        put("jumpHeight", "Jump Height")
        put("verticalUpSpeed", "Vertical Up Speed")
        put("verticalDownSpeed", "Vertical Down Speed")
        put("motionInterval", "Motion Interval")
        put("glideSpeed", "Glide Speed")
        put("vanillaFly", "Vanilla Fly")
        put("repeat", "Repeat")
        put("delay", "Delay")
        put("enabled", "Enabled")
        put("disabled", "Disabled")
        put("players_only", "Players Only")
        put("mobs_only", "Mob Aura")
        put("time", "Time")
        put("keep_distance", "Distance")
        put("tp_speed", "Teleport Speed")
        put("packets", "Packets")
        put("strafe", "Strafe")
        put("tp_aura", "TP Aura")
        put("teleport_behind", "TP Behind")
        put("strafe_angle", "Strafe Angle")
        put("strafe_speed", "Strafe Speed")
        put("strafe_radius", "Strafe Radius")
        put("clear", "Clear")
        put("rain", "Rain")
        put("thunderstorm", "Thunderstorm")
        put("intensity", "Intensity")
        put("interval", "Interval")
        put("walk_speed", "Walk Speed")
        put("fall_speed", "Fall Speed")
    }

    private fun zh() = buildMap {
        put("fly", "飞行")
        put("no_clip", "穿墙")
        put("zoom", "缩放")
        put("air_jump", "空中跳跃")
        put("speed", "速度")
        put("full_bright", "夜视")
        put("haste", "急速")
        put("jetpack", "喷气背包")
        put("levitation", "飘浮")
        put("high_jump", "高跳")
        put("slow_falling", "缓降")
        put("anti_knockback", "防击退")
        put("poseidon", "海神")
        put("regeneration", "生命恢复")
        put("bhop", "连跳")
        put("sprint", "疾跑")
        put("no_hurt_camera", "无伤害抖动")
        put("anti_afk", "防挂机")
        put("auto_walk", "自动行走")
        put("desync", "异步发包")
        put("position_logger", "实体追踪器")
        put("killaura", "杀戮光环")
        put("motion_fly", "动量飞行")
        put("free_camera", "自由视角")
        put("player_tracer", "玩家追踪器")
        put("critic", "批评家")
        put("nausea", "反胃")
        put("health_boost", "生命提升")
        put("jump_boost", "跳跃增强")
        put("resistance", "抗性")
        put("fire_resist", "抗火")
        put("swiftness", "极速")
        put("instant_health", "瞬间治疗")
        put("strength", "力量")
        put("instant_damage", "瞬间伤害")
        put("anti_crystal", "反水晶")
        put("bad_omen", "凶兆")
        put("conduit_power", "潮涌能量")
        put("darkness", "黑暗")
        put("fatal_poison", "剧毒")
        put("hunger", "饥饿")
        put("poison", "中毒")
        put("village_omen", "村庄英雄")
        put("weakness", "虚弱")
        put("wither", "凋零")
        put("night_vision", "夜视")
        put("invisibility", "隐身")
        put("saturation", "饱和")
        put("absorption", "伤害吸收")
        put("blindness", "失明")
        put("hunger", "饥饿")
        put("time_shift", "时间修改器")
        put("crash", "崩溃")
        put("weather_controller", "天气控制器")

        // Below for module options
        put("times", "次数")
        put("flySpeed", "飞行速度")
        put("range", "范围")
        put("cps", "CPS")
        put("amplifier", "等级")
        put("nightVision", "夜视")
        put("scanRadius", "搜索半径")
        put("jumpHeight", "跳跃高度")
        put("verticalUpSpeed", "垂直上升速度")
        put("verticalDownSpeed", "垂直下降速度")
        put("motionInterval", "运动间隔")
        put("glideSpeed", "滑行速度")
        put("vanillaFly", "香草飞行")
        put("repeat", "重复")
        put("delay", "延迟")
        put("enabled", "启用")
        put("disabled", "禁用")
        put("players_only", "仅限玩家")
        put("mobs_only", "生物光环")
        put("time", "时间")
        put("keep_distance", "距离")
        put("tp_speed", "传送速度")
        put("packets", "发包次数")
        put("strafe", "环绕")
        put("tp_aura", "传送光环")
        put("teleport_behind", "传送到身后")
        put("strafe_angle", "环绕角")
        put("strafe_speed", "环绕速度")
        put("strafe_radius", "环绕半径")
        put("clear", "晴朗")
        put("rain", "雨")
        put("thunderstorm", "雷雨")
        put("intensity", "强度")
        put("interval", "间隔")
    }

    fun getTranslationMap(language: String): Map<String, String> {
        val translationMap = map[language]
        if (translationMap != null) {
            return translationMap
        }

        map.forEach { (key, value) ->
            if (key.startsWith(language)) {
                return value
            }
        }

        return map["en"]!!
    }

}

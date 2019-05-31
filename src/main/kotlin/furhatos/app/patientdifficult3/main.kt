package furhatos.app.patientdifficult3

import furhatos.app.patientdifficult3.flow.*
import furhatos.skills.Skill
import furhatos.flow.kotlin.*

class Patientdifficult3Skill : Skill() {
    override fun start() {
        Flow().run(Idle)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
